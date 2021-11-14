import { Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
  selector: '[appInvert]',
})
export class InvertDirective {
  @HostBinding('class.invert') isInverted = false;

  @HostListener('mouseenter') onMouseEnter() {
    this.isInverted = true;
  }

  @HostListener('mouseleave') onMouseLeave() {
    this.isInverted = false;
  }
}
