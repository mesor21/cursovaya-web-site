package com.example.Kursovaya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import com.example.Kursovaya.logic.Departament;
import com.example.Kursovaya.logic.Post;
import com.example.Kursovaya.logic.Themes;
import com.example.Kursovaya.person.Admin;
import com.example.Kursovaya.person.Author;
import com.example.Kursovaya.person.CheafEditer;
import com.example.Kursovaya.person.DepartmentEditor;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
public class KursovayaApplication {
	public static void main(String[] args) {
		SpringApplication.run(KursovayaApplication.class, args);
		/*

		Admin x = new Admin("Dima","Mesor","menz@gmail.com","1234");
		Departament Lol = x.createDepartament("Lol");
		Author newAuthor = x.createAuthor("Chel", "Molodoy","molchel@bk.ru", "123",Lol);

		System.out.println(newAuthor.getName()+" "+newAuthor.getSurename());
		System.out.println(newAuthor.getEmail()+" "+newAuthor.getPass());
		System.out.println(newAuthor.getJobTitle()+" "+newAuthor.getDep4Author().getDep());

		System.out.println();
		//test create CheafEditor
		CheafEditer cheaf = x.createCheafEditer("BIG","BOSS","cheaf228@mail.ru","54321");
		Themes Syrniki = cheaf.createThemes("Syrniki","09:00 21.09.2022", Lol.getDep());

		System.out.println(cheaf.getName()+" "+cheaf.getSurename());
		System.out.println(cheaf.getEmail()+" "+cheaf.getPass());
		System.out.println(cheaf.getJobTitle());

		System.out.println();
		//test create DepartmentEditor
		DepartmentEditor depEd = x.createDepartmentEditor("Small", "Boss", "hzzzz@qqq.com", "741",Lol);

		System.out.println(depEd.getName()+" "+depEd.getSurename());
		System.out.println(depEd.getEmail()+" "+depEd.getPass());
		System.out.println(depEd.getJobTitle()+" "+depEd.getDep4DepEditor().getDep());
		System.out.println();
		System.out.println(newAuthor.getName()+" "+newAuthor.getSurename());
		System.out.println(newAuthor.getEmail()+" "+newAuthor.getPass());
		System.out.println(newAuthor.getJobTitle()+" "+newAuthor.getDep4Author().getDep());

		Post muka = depEd.createPost(Syrniki, newAuthor, "Muka good","");

		System.out.println(muka.getTheme().getTheme()+" "+muka.getPostName());
		System.out.println(muka.getPostNews());
		System.out.println(muka.getPostComment());

		newAuthor.editPost(muka, "Eto ne muka)))");

		System.out.println(muka.getPostNews());
		depEd.editPost(muka,Syrniki, newAuthor,muka.getPostName(),muka.getPostNews(),"Misha, ..., peredelivay");

		System.out.println(muka.getPostComment());

		newAuthor.editPost(muka, muka.getPostNews()+" Mi vce na ney cidim)");

		System.out.println(muka.getPostNews());

		 */
	}
}







