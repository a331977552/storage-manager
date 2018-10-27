package com.storage.entity.custom;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderStatis {

	private long   totalNumber;
	private long   unprocessed;
	private long   confirmed;
	private long   dispatched;
	private long   finished;
	private long   closed;

}
