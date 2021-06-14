package com.studentapp.cucumber.steps;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)


public class PlayMixSteps {
	 @Managed  WebDriver driver;
	
@Test	 

 @Given("^User navigates to Mixcloud website$")
 public void user_navigates_to_mixcloud_website() {
 	driver.get("https://www.mixcloud.com/");
    driver.manage().window().maximize();
 }
 @When("^User clicks on the login button on page$")
 public void user_clicks_on_the_login_button_on_page() throws Throwable {
 driver.findElement(By.xpath("//*[contains(text(), 'Login')]")).click();
 }
 @When("^User enters a valid username$")
 public void user_enters_a_valid_username() {
 	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("castiel.andreeva@gmail.com");
  }
 @When("^User enters a valid password$")
 public void user_enters_a_valid() {
 	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("dexter124356094");
  }
 @When("^User clicks on the log in button$")
 public void user_clicks_on_the_log_in_button() throws Throwable {
 	Thread.sleep(3000);
 	driver.findElement(By.xpath("//*[contains(text(),  'Log In')]")).click();
    }	
 @When("^User should be successfully logged in$")
 public void user_should_be_logged_in() throws Throwable {
 	Thread.sleep(2000);
 	WebElement Valkyrie=driver.findElement(By.xpath("//b[contains(text(),'Ur_Valkyrie')]"));
 	Assert.assertEquals(true,  Valkyrie.isDisplayed());
 }
 @When("^User clicks Search field$")
	public void user_clicks_Search_field() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input['mixcloud_query']")).click();
		driver.findElement(By.xpath("//div/input['mixcloud_query']")).sendKeys("martin garrix");
	}
 @When("^User enters artistname in the Search field$")
	public void user_enters_in_the_Search_field() throws Throwable {
     System.out.println("Okay! Let's Dance, Guys!");
	}
 @Then("^User opens the artist$")
	public void user_opens_the_artist() throws Throwable {
		Thread.sleep(7000);
		driver.findElement(By.xpath("//img[@alt='Martin Garrix']")).click();
	}
	@When("^Open the song$")
    public void open_the_song() throws Throwable {
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[contains(text(),'The Martin Garrix Show #352')]")).click();
    }
    @When("^Add to favorites$")
    public void add_to_favorites() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/div[@id='react-root']/div[1]/section[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/section[1]/div[2]/div[1]/footer[1]/div[1]/button[1]")).click();
    }
    @When("^Trasition to the main page$")
    public void transition_to_the_main_page() throws Throwable {
    Thread.sleep(3000);
    driver.findElement(By.xpath("//body/div[@id='react-root']/div[1]/section[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/*[1]")).click();
    }
    @When("^Go to the favorites$")
    public void go_to_the_favorites() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/div[@id='react-root']/div[1]/section[1]/div[3]/div[1]/div[1]/div[3]/div[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/nav[1]/div[3]/a[1]")).click();
    }
    @When("^Favorite song should be successfully displayed$")
    public void favorite_song() throws Throwable {
        Thread.sleep(3000);
        WebElement Favorites=driver.findElement(By.xpath("//a[contains(text(),'The Martin Garrix Show #352')]"));
        Assert.assertEquals(true,  Favorites.isDisplayed());
    }
    @When("^Open favorite song$")
    public void open_favorite_song() throws Throwable {
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[contains(text(),'The Martin Garrix Show #352')]")).click();
    }
    @When("^Delete favorite song$")
    public void delete_song() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='react-root']/div[1]/section[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/section[1]/div[2]/div[1]/footer[1]/div[1]/button[1]")).click();
    }
}

