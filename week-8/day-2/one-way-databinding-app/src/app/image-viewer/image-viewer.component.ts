import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-image-viewer',
  templateUrl: './image-viewer.component.html',
  styleUrls: ['./image-viewer.component.css']
})
export class ImageViewerComponent {

  /**
   * Image widget
   */
  imageLink: string = '';

  onImageLinkInputChange(event: Event) {
    this.imageLink = (<HTMLInputElement>event.target).value;
  }

}
