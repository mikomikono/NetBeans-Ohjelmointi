package wad.controller;

import java.util.Date;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExamController {


    @RequestMapping(value = "/exams", method = RequestMethod.GET)
    public String listExams(Model model) {
        return "exams";
    }

    @RequestMapping(value = "/exams/{id}", method = RequestMethod.GET)
    public String viewExam(Model model, @PathVariable Long id) {


        return "exam";
    }

    @RequestMapping(value = "/exams", method = RequestMethod.POST)
    public String addExam(@RequestParam String subject,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date examDate) {


        return "redirect:/exams";
    }

    @RequestMapping(value = "/exams/{examId}/questions/{questionId}", method = RequestMethod.POST)
    @Transactional
    public String addQuestionToExam(@PathVariable Long examId, @PathVariable Long questionId) {

        return "redirect:/exams/" + examId;
    }
}
