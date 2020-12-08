import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OwnerdashboardComponent } from './ownerdashboard.component';

describe('OwnerdashboardComponent', () => {
  let component: OwnerdashboardComponent;
  let fixture: ComponentFixture<OwnerdashboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OwnerdashboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OwnerdashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
