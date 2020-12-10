import { Component, OnInit } from '@angular/core';
import { resetFakeAsyncZone } from '@angular/core/testing';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  profile
  message:String
  
  constructor() { }

  ngOnInit(): void {
  }

  this.service.login(this.profile).subscribe(
    data=> console.log(data),
    error =>this.message = error.message,
    () => this.reset()
  );
}
reset()

}
