package com.bean;

public class SampleBean {
	private Integer sampleId;
	private String sampleName;

	public Integer getSampleId() {
		return sampleId;
	}

	public void setSampleId(Integer sampleId) {
		this.sampleId = sampleId;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	
	@Override
	public String toString() {
		return new String("SampleId: " + sampleId + ", " + sampleName);
	}
}
