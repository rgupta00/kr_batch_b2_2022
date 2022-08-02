import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DemopipeComponent } from './demopipe.component';

describe('DemopipeComponent', () => {
  let component: DemopipeComponent;
  let fixture: ComponentFixture<DemopipeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DemopipeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DemopipeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
