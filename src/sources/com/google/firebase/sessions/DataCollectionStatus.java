package com.google.firebase.sessions;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DataCollectionStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataCollectionState f20880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataCollectionState f20881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f20882c;

    public DataCollectionStatus(DataCollectionState performance, DataCollectionState crashlytics, double d5) {
        m.f(performance, "performance");
        m.f(crashlytics, "crashlytics");
        this.f20880a = performance;
        this.f20881b = crashlytics;
        this.f20882c = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCollectionStatus)) {
            return false;
        }
        DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
        return this.f20880a == dataCollectionStatus.f20880a && this.f20881b == dataCollectionStatus.f20881b && Double.compare(this.f20882c, dataCollectionStatus.f20882c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f20882c) + ((this.f20881b.hashCode() + (this.f20880a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f20880a + ", crashlytics=" + this.f20881b + ", sessionSamplingRate=" + this.f20882c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DataCollectionStatus() {
        DataCollectionState dataCollectionState = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        this(dataCollectionState, dataCollectionState, 1.0d);
    }
}
