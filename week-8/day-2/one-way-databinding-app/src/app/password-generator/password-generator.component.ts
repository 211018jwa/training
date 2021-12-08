import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-password-generator',
  templateUrl: './password-generator.component.html',
  styleUrls: ['./password-generator.component.css']
})
export class PasswordGeneratorComponent {

  generatedPassword: string = '';
  desiredPasswordLength: number = 0;

  inputType: string = 'number';

  onButtonClick() {
    // Create code that randomly generates a password
    let allowedCharacters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()';
    let password = '';

    for (let i = 0; i < this.desiredPasswordLength; i++) {
      password += allowedCharacters
        .charAt(Math.floor(Math.random() * allowedCharacters.length))
    }

    this.generatedPassword = password;
  }

  onDesiredPasswordLengthInputChange(event: Event) {
    // Grab the element that the event happened on
    let inputElement = event.target;
    this.desiredPasswordLength = Number((<HTMLInputElement> inputElement).value);
  }

}
