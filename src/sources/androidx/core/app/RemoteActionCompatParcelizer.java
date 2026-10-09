package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import sa.a;
import sa.b;
import sa.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarH = remoteActionCompat.f1387a;
        boolean z11 = true;
        if (aVar.e(1)) {
            cVarH = aVar.h();
        }
        remoteActionCompat.f1387a = (IconCompat) cVarH;
        CharSequence charSequence = remoteActionCompat.f1388b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f51524e);
        }
        remoteActionCompat.f1388b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1389c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f51524e);
        }
        remoteActionCompat.f1389c = charSequence2;
        remoteActionCompat.f1390d = (PendingIntent) aVar.g(remoteActionCompat.f1390d, 4);
        boolean z12 = remoteActionCompat.f1391e;
        if (aVar.e(5)) {
            z12 = ((b) aVar).f51524e.readInt() != 0;
        }
        remoteActionCompat.f1391e = z12;
        boolean z13 = remoteActionCompat.f1392f;
        if (!aVar.e(6)) {
            z11 = z13;
        } else if (((b) aVar).f51524e.readInt() == 0) {
            z11 = false;
        }
        remoteActionCompat.f1392f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1387a;
        aVar.i(1);
        aVar.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1388b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f51524e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1389c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1390d;
        aVar.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z11 = remoteActionCompat.f1391e;
        aVar.i(5);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = remoteActionCompat.f1392f;
        aVar.i(6);
        parcel.writeInt(z12 ? 1 : 0);
    }
}
