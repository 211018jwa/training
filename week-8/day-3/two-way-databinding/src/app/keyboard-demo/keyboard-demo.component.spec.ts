import { ComponentFixture, TestBed } from '@angular/core/testing';

import { KeyboardDemoComponent } from './keyboard-demo.component';

describe('KeyboardDemoComponent', () => {
  let component: KeyboardDemoComponent;
  let fixture: ComponentFixture<KeyboardDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ KeyboardDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(KeyboardDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
