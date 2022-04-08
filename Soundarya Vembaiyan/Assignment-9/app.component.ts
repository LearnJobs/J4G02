import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Employee';
 empForm=new FormGroup({
    empName:new FormControl(''),
    empId:new FormControl(''),
   empDepartment:new FormControl('')
  });

  public onSubmit(){
    console.log("Submitted")
    console.log(this.empForm.value)
  }
}
