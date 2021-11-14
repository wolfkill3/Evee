import { Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
  selector: '[appScale]',
})
export class ScaleDirective {
  @HostBinding('class.scaled') isScaled = false;

  @HostListener('mouseenter') onMouseEnter() {
    this.isScaled = true;
  }

  @HostListener('mouseleave') onMouseLeave() {
    this.isScaled = false;
  }
}
