package app.rive;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface Result<T> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Error implements Result {
        public static final int $stable = 8;
        private final Throwable throwable;

        public Error(Throwable throwable) {
            m.f(throwable, "throwable");
            this.throwable = throwable;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = error.throwable;
            }
            return error.copy(th2);
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            m.f(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && m.a(this.throwable, ((Error) obj).throwable);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Loading implements Result {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Success<T> implements Result<T> {
        public static final int $stable = 0;
        private final T value;

        public Success(T t6) {
            this.value = t6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        public final Success<T> copy(T t6) {
            return new Success<>(t6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && m.a(this.value, ((Success) obj).value);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t6 = this.value;
            if (t6 == null) {
                return 0;
            }
            return t6.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.value + ')';
        }
    }
}
