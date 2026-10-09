package com.lingodeer.network.model;

import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ApiResponse<T> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Error extends ApiResponse {
        private final int code;
        private final String message;
        private final String result;

        public /* synthetic */ Error(String str, int i11, String str2, int i12, f fVar) {
            this(str, (i12 & 2) != 0 ? -1 : i11, (i12 & 4) != 0 ? BuildConfig.VERSION_NAME : str2);
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i11, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = error.message;
            }
            if ((i12 & 2) != 0) {
                i11 = error.code;
            }
            if ((i12 & 4) != 0) {
                str2 = error.result;
            }
            return error.copy(str, i11, str2);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.code;
        }

        public final String component3() {
            return this.result;
        }

        public final Error copy(String message, int i11, String result) {
            m.f(message, "message");
            m.f(result, "result");
            return new Error(message, i11, result);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return m.a(this.message, error.message) && this.code == error.code && m.a(this.result, error.result);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode() + e.b(this.code, this.message.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.message;
            int i11 = this.code;
            return a.k(e.q(i11, "Error(message=", str, ", code=", ", result="), this.result, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message, int i11, String result) {
            super(null);
            m.f(message, "message");
            m.f(result, "result");
            this.message = message;
            this.code = i11;
            this.result = result;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Success<T> extends ApiResponse<T> {
        private final T data;

        public Success(T t6) {
            super(null);
            this.data = t6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.data;
        }

        public final Success<T> copy(T t6) {
            return new Success<>(t6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && m.a(this.data, ((Success) obj).data);
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            T t6 = this.data;
            if (t6 == null) {
                return 0;
            }
            return t6.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.data + ")";
        }
    }

    public /* synthetic */ ApiResponse(f fVar) {
        this();
    }

    private ApiResponse() {
    }
}
