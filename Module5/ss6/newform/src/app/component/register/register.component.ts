import {Component, OnInit} from '@angular/core';
import {Register} from './register';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  rfRegister: FormGroup;
  country: string[] = ['Việt Nam', 'Mỹ', 'Nhật', 'Canada'];
  constructor() {
    this.rfRegister = new FormGroup({
      email: new FormControl('', [Validators.email, Validators.required]),
      passworld: new FormControl('', [Validators.required, Validators.minLength(6)]),
      confirmpassword: new FormControl('', [Validators.required, Validators.minLength(6)]),
      country: new FormControl('', [Validators.required]),
      age: new FormControl('', [ Validators.required, Validators.min(18)]),
      gender: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required, Validators.pattern('^\\+84\\d{9}$')])
    });
  }

  ngOnInit(): void {
  }

}
