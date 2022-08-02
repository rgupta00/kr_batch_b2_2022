import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HelloeventComponent } from './helloevent.component';

describe('HelloeventComponent', () => {
  let component: HelloeventComponent;
  let fixture: ComponentFixture<HelloeventComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HelloeventComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HelloeventComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
