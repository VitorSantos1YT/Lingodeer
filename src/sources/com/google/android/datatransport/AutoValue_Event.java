package com.google.android.datatransport;

import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_Event<T> extends Event<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Priority f7801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProductData f7802c;

    @Override // com.google.android.datatransport.Event
    public final Integer a() {
        return null;
    }

    @Override // com.google.android.datatransport.Event
    public final EventContext b() {
        return null;
    }

    @Override // com.google.android.datatransport.Event
    public final Object c() {
        return this.f7800a;
    }

    @Override // com.google.android.datatransport.Event
    public final Priority d() {
        return this.f7801b;
    }

    @Override // com.google.android.datatransport.Event
    public final ProductData e() {
        return this.f7802c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if (event.a() != null || !this.f7800a.equals(event.c()) || !this.f7801b.equals(event.d())) {
            return false;
        }
        ProductData productData = this.f7802c;
        if (productData == null) {
            if (event.e() != null) {
                return false;
            }
        } else if (!productData.equals(event.e())) {
            return false;
        }
        return event.b() == null;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f7800a.hashCode()) * 1000003) ^ this.f7801b.hashCode()) * 1000003;
        ProductData productData = this.f7802c;
        return (iHashCode ^ (productData == null ? 0 : productData.hashCode())) * 1000003;
    }

    public final String toString() {
        return bjXGJ.cQCOoDyHO + this.f7800a + ", priority=" + this.f7801b + ", productData=" + this.f7802c + ", eventContext=null}";
    }

    public AutoValue_Event(Object obj, Priority priority, ProductData productData) {
        if (obj != null) {
            this.f7800a = obj;
            if (priority != null) {
                this.f7801b = priority;
                this.f7802c = productData;
                return;
            }
            throw new NullPointerException(PQgum.PWZrGDIC);
        }
        throw new NullPointerException("Null payload");
    }
}
