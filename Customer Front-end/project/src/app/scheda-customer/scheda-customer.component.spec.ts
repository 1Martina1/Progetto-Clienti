import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SchedaCustomerComponent } from './scheda-customer.component';

describe('SchedaCustomerComponent', () => {
  let component: SchedaCustomerComponent;
  let fixture: ComponentFixture<SchedaCustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SchedaCustomerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SchedaCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
