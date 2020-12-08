import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OregisterComponent } from './oregister.component';

describe('OregisterComponent', () => {
  let component: OregisterComponent;
  let fixture: ComponentFixture<OregisterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OregisterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
