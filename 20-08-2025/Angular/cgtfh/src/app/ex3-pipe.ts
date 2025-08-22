import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'ex3'
})
export class Ex3Pipe implements PipeTransform {

  transform(value: number): string {
    const fahrenheit = (value * 9 / 5) + 32;
    return Math.round(fahrenheit) + 'F';

  }

}
