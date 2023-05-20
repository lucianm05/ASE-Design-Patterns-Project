package proiect.program;

import java.util.List;

import felice.form.Checkbox;
import felice.form.Form;
import felice.form.FormControl;
import felice.form.Input;
import felice.form.factory.FormControlEnum;
import felice.form.factory.FormFactorySingleton;
import felice.select.Option;
import felice.select.Select;
import proiect.select.decorator.Decorator;
import proiect.select.decorator.SelectDecorator;
import proiect.select.facade.SelectFacade;

public class Main {
	public static void main(String[] args) {
		Select select = new Select("Social Media", List.of(
				new Option("Twitter", "twitter"),
				new Option("Telegram", "telegram"),
				new Option("Reddit", "reddit"),
				new Option("Instagram", "instagram")
				));
		
		select.onClick();
		
		System.out.println();
		select.onChange(2);

		System.out.println();
		select.onChange(3);

		select.onClick();
		
		System.out.println();
		select.onChange(6);
		
		System.out.println("\n=== Selectare optiune prin intermediul unui Facade ===\n");
		SelectFacade selectFacade = new SelectFacade();
		selectFacade.selectOption(select, 3);
		
		System.out.println("\n=== Selectare optiune prin intermediul decoratorului ===\n");
		SelectDecorator selectDecorator = new SelectDecorator(select);
		selectDecorator.onClick();
		selectDecorator.onChange(4);
		
		System.out.println("\n=== Form Factory + Observer ===\n");
		
		FormFactorySingleton formFactory = FormFactorySingleton.getInstance();
		Form form = new Form();
		FormControl agreeToTermsCheckbox = formFactory.createFormControl(
				FormControlEnum.checkbox, 
				"agreeToTerms");
		FormControl firstNameInput = formFactory.createFormControl(
				FormControlEnum.input, 
				"firstName");
		FormControl lastNameInput = formFactory.createFormControl(
				FormControlEnum.input, 
				"lastName");
		
		agreeToTermsCheckbox.addObserver(form);
		firstNameInput.addObserver(form);
		lastNameInput.addObserver(form);
		
		agreeToTermsCheckbox.onChange("true");
		firstNameInput.onChange("Lucian");
		lastNameInput.onChange("Manea");
	}
}
