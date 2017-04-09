package com.oraclejava.alpha.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.oraclejava.alpha.model.Notice;
import com.oraclejava.alpha.service.NoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	private  static Logger  logger =
			 LoggerFactory.getLogger(NoticeController.class);

	@Autowired
	private NoticeService noticeService;

	@RequestMapping
	public String noticeList(Model model) {
		System.out.println("call notice list111");
		
		if (logger.isDebugEnabled()) {
			
			logger.debug("call notice  list222");
			
		}
		
		
		List<Notice> notice = noticeService.selectNotices();

		System.out.println("size : " + notice.size());

		model.addAttribute("notices", notice);

		return "notice/noticeList";
	}

	@RequestMapping("new")
	public String noticeNewForm(Notice notice) {

		System.out.println("call  notice new ~~~~");

		return "notice/noticeNew";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String createNotice(Notice notice) {
		System.out.println("call  register ~~~~");

		System.out.println("title : " + notice.getTitle());
		System.out.println("contents :" + notice.getContents());

		noticeService.insertNotice(notice);

		return "redirect:/notice";
	}

	@RequestMapping(value = "{noticeId}", method = RequestMethod.GET)
	public String show(@PathVariable("noticeId") Long noticeId, Model model) {

		Notice notice = noticeService.selectNotice(noticeId);

		model.addAttribute("notice", notice);

		return "notice/noticeShow";

	}

	@RequestMapping(value = "{noticeId}/edit", method = RequestMethod.GET)
	public ModelAndView editForm(@PathVariable("noticeId") Long noticeId) {

		Notice notice = noticeService.selectNotice(noticeId);

		ModelAndView mav = new ModelAndView("notice/noticeEdit");

		mav.addObject("notice", notice);
		return mav;
	}

	@RequestMapping(value = "{noticeId}", method = RequestMethod.POST)
	public ModelAndView edit(@PathVariable("noticeId") Long noticeId, Notice notice) {
		notice.setId(noticeId);
		noticeService.updateNotice(notice);
		return new ModelAndView("redirect:/notice/" + noticeId);
	}

	@RequestMapping(value="{noticeId}/delete",method=RequestMethod.POST)

	public ModelAndView delete(@PathVariable("noticeId") Long noticeId) {
		noticeService.deleteNotice(noticeId);

		return new ModelAndView("redirect:/notice");
	}

}

