package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PhoneAuthProvider {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ForceResendingToken extends AbstractSafeParcelable {
        public static final Parcelable.Creator<ForceResendingToken> CREATOR = new zzd();

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            SafeParcelWriter.r(parcel, SafeParcelWriter.q(parcel, 20293));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class OnVerificationStateChangedCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Logger f17910a = new Logger("PhoneAuthProvider", new String[0]);

        public void a(String str) {
            f17910a.b("Sms auto retrieval timed-out.", new Object[0]);
        }

        public abstract void c(PhoneAuthCredential phoneAuthCredential);

        public abstract void d(FirebaseException firebaseException);

        public void b(String str, ForceResendingToken forceResendingToken) {
        }
    }
}
