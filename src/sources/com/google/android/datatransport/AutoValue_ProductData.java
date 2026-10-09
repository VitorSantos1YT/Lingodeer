package com.google.android.datatransport;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ProductData extends ProductData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f7803a;

    public AutoValue_ProductData(Integer num) {
        this.f7803a = num;
    }

    @Override // com.google.android.datatransport.ProductData
    public final Integer a() {
        return this.f7803a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProductData)) {
            return false;
        }
        Integer num = this.f7803a;
        Integer numA = ((ProductData) obj).a();
        if (num == null) {
            return numA == null;
        }
        return num.equals(numA);
    }

    public final int hashCode() {
        Integer num = this.f7803a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f7803a + "}";
    }
}
