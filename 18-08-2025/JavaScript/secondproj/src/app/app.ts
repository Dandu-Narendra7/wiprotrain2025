import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
//ex-7
@Component({
  selector: 'app-root',
  imports: [FormsModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
//ex-8
export class App {
  protected readonly title = signal('secondproj');
  empname:string="Narendra";
//ex-9
  message(){
    // console.log(this.empname);
    alert(this.empname);
  }
}
