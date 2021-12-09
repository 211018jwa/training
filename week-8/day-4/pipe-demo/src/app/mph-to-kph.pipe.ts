import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'mphToKph'
})
export class MphToKphPipe implements PipeTransform {

  transform(value: number, reversed: boolean = false): number {
    if (reversed) { // true, then do kph to mph
      return value * 0.62137;
    } else { // false, then do mph to kph
      return value * 1.60934;
    }
  }

}
