package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_CreationContext extends CreationContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f8049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clock f8050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8051d;

    public AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f8048a = context;
        if (clock == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f8049b = clock;
        if (clock2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f8050c = clock2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f8051d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Context a() {
        return this.f8048a;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final String b() {
        return this.f8051d;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Clock c() {
        return this.f8050c;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Clock d() {
        return this.f8049b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        return this.f8048a.equals(creationContext.a()) && this.f8049b.equals(creationContext.d()) && this.f8050c.equals(creationContext.c()) && this.f8051d.equals(creationContext.b());
    }

    public final int hashCode() {
        return ((((((this.f8048a.hashCode() ^ 1000003) * 1000003) ^ this.f8049b.hashCode()) * 1000003) ^ this.f8050c.hashCode()) * 1000003) ^ this.f8051d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f8048a);
        sb2.append(", wallClock=");
        sb2.append(this.f8049b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f8050c);
        sb2.append(", backendName=");
        return a.k(sb2, this.f8051d, "}");
    }
}
