package com.google.common.base;

import com.google.type.bACG.scNRoQgKSYX;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class MoreObjects {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ToStringHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ValueHolder f16369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ValueHolder f16370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16371d;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class UnconditionalValueHolder extends ValueHolder {
            private UnconditionalValueHolder() {
            }

            public /* synthetic */ UnconditionalValueHolder(int i11) {
                this();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static class ValueHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f16372a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f16373b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public ValueHolder f16374c;
        }

        public ToStringHelper(String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.f16369b = valueHolder;
            this.f16370c = valueHolder;
            this.f16371d = false;
            this.f16368a = str;
        }

        public final void a(int i11, String str) {
            e(str, String.valueOf(i11));
        }

        public final void b(long j11, String str) {
            e(str, String.valueOf(j11));
        }

        public final void c(Object obj, String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.f16370c.f16374c = valueHolder;
            this.f16370c = valueHolder;
            valueHolder.f16373b = obj;
            valueHolder.f16372a = str;
        }

        public final void d(String str, boolean z11) {
            e(str, String.valueOf(z11));
        }

        public final void e(String str, String str2) {
            UnconditionalValueHolder unconditionalValueHolder = new UnconditionalValueHolder(0);
            this.f16370c.f16374c = unconditionalValueHolder;
            this.f16370c = unconditionalValueHolder;
            unconditionalValueHolder.f16373b = str2;
            unconditionalValueHolder.f16372a = str;
        }

        public final void f(Object obj) {
            ValueHolder valueHolder = new ValueHolder();
            this.f16370c.f16374c = valueHolder;
            this.f16370c = valueHolder;
            valueHolder.f16373b = obj;
        }

        public final String toString() {
            boolean z11 = this.f16371d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f16368a);
            sb2.append('{');
            String str = BuildConfig.VERSION_NAME;
            for (ValueHolder valueHolder = this.f16369b.f16374c; valueHolder != null; valueHolder = valueHolder.f16374c) {
                Object obj = valueHolder.f16373b;
                if ((valueHolder instanceof UnconditionalValueHolder) || obj != null || !z11) {
                    sb2.append(str);
                    String str2 = valueHolder.f16372a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    private MoreObjects() {
    }

    public static ToStringHelper b(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException(scNRoQgKSYX.beNuYUKsl);
    }
}
