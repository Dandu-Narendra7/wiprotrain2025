import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appEx4]'
})
export class Ex4 {
  constructor(el: ElementRef) {
    el.nativeElement.style.color = 'yellow';
    el.nativeElement.style.textDecoration = 'line-through';



  }
}
