package com.fuqqqq.snowflake4j;

/**
 * Builder for SnowFlake ID Worker.
 */
public final class IdWorkerBuilder {
    private static final long TW_EPOCH = 1288834974657L; // twitter epoch: 2010-11-04 09:42:54.657

    private long epoch = TW_EPOCH;
    private Long datacenterId;
    private Long workerId;


    /**
     * Set Worker ID.
     *
     * @param workerId long for worker ID
     * @return self
     */
    public IdWorkerBuilder setWorkerId(long workerId) {
        this.workerId = workerId;
        return this;
    }

    /**
     * Set DataCenter ID.
     *
     * @param dataCenterId long for dataCenter ID
     * @return self
     */
    public IdWorkerBuilder setDataCenterId(long dataCenterId) {
        this.datacenterId = dataCenterId;
        return this;
    }

    /**
     * Set epoch.
     *
     * @param epoch Timestamp for epoch
     * @return self
     */
    public IdWorkerBuilder setEpoch(long epoch) {
        this.epoch = epoch;
        return this;
    }

    /**
     * Build an instance for IdWorker.
     *
     * @return new instance for IdWorker
     */
    public IdWorker build() {
        if (workerId == null) {
            throw new NullPointerException("workerId Id is null.");
        }
        if (datacenterId == null) {
            throw new NullPointerException("datacenter Id is null.");
        }
        return new IdWorker(workerId, datacenterId, epoch);
    }
}
