package ua.danni.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.danni.entity.Courses;
import ua.danni.service.CoursesService;
import ua.danni.service.ProfessorService;

/**
 * Created by Artem on 09.04.2016.
 */
@Controller
public class AdminController {

  @Autowired
   CoursesService coursesService;

  @Autowired
    ProfessorService professorService;
 /*   @RequestMapping(value="/admin/list_courses_adm", method = RequestMethod.GET)
    public String helloWorld(ModelMap model) {

        model.addAttribute("coursesList", courseList.loadCoursesAdm());
        return "list_courses_adm";

    }*/

    @RequestMapping(value="/admin/list_courses_adm", method = RequestMethod.GET)
    public ModelAndView listCourses() {

        return new ModelAndView("list_courses_adm","coursesList",coursesService.getAll());

    }

    //Добавить курсы
    @RequestMapping(value="/admin/add_course", method = RequestMethod.GET)
    public ModelAndView addCourses(Model model) {
        //model.addAttribute("courses", new Courses());
        return new ModelAndView("add_course","professorsList",professorService.findProfessor());

    }
    //Обработчик добавления курсов
    @RequestMapping(value="/admin/add_course", method = RequestMethod.POST)
    public String addCoursesSubmit(Courses courses) {
        coursesService.addCourses(courses);
        return "redirect:/admin/list_courses_adm";

    }

    //Редактировать курсы
    @RequestMapping(value="/admin/edit_course/{idcourse}", method = RequestMethod.GET)
    public ModelAndView EditCourses(Model model,@PathVariable(value="idcourse") int idcourse) {
        model.addAttribute("coursesListEdit", coursesService.getById(idcourse));
        return new ModelAndView("edit_course","professorsList",professorService.findProfessor());

    }
    //Обработчик редактирования курсов
    @RequestMapping(value="/admin/edit_course", method = RequestMethod.POST)
    public String EditCoursesSubmit(Courses courses) {
        coursesService.addCourses(courses);
        return "redirect:/admin/list_courses_adm";

    }





    @RequestMapping(value = "/admin/delete/idcourse/{idcourse}", method=RequestMethod.GET)
    public ModelAndView deleteCourse(@PathVariable(value="idcourse") int idcourse) {
        coursesService.delete(idcourse);
        return new ModelAndView("redirect:/admin/list_courses_adm");
    }


}
