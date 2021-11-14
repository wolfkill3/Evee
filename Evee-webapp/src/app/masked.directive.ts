import { Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
  selector: '[appMasked]',
})
export class MaskedDirective {
  @HostBinding('class.masked') isMasked = false;

  @HostListener('mouseenter') onMouseEnter() {
    this.isMasked = true;
  }

  @HostListener('mouseleave') onMouseLeave() {
    this.isMasked = false;
  }
}
