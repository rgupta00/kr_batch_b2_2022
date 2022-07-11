package com.day3.session1.e.enum_demo;

enum TrafficLight {
	RED {
		@Override
		public TrafficLight nextLight() {
			return YELLOW;
		}
	},
	YELLOW {
		@Override
		public TrafficLight nextLight() {
			return GREEN;
		}
	},
	GREEN {
		@Override
		public TrafficLight nextLight() {
			return YELLOW;
		}
	};

	public abstract TrafficLight nextLight();
}

public class G_Abstract_Method_In_Enum {

	public static void main(String[] args) {
		TrafficLight light=TrafficLight.GREEN;
		System.out.println(light.nextLight());
	}
}
