package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f9077c;

    public StringToIntConverter() {
        this.f9075a = 1;
        this.f9076b = new HashMap();
        this.f9077c = new SparseArray();
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* bridge */ /* synthetic */ String Y(Object obj) {
        String str = (String) this.f9077c.get(((Integer) obj).intValue());
        return (str == null && this.f9076b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9075a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f9076b;
        for (String str : map.keySet()) {
            arrayList.add(new zac(str, ((Integer) map.get(str)).intValue()));
        }
        SafeParcelWriter.o(parcel, 2, arrayList, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public StringToIntConverter(int i11, ArrayList arrayList) {
        this.f9075a = i11;
        this.f9076b = new HashMap();
        this.f9077c = new SparseArray();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            zac zacVar = (zac) arrayList.get(i12);
            String str = zacVar.f9081b;
            int i13 = zacVar.f9082c;
            this.f9076b.put(str, Integer.valueOf(i13));
            this.f9077c.put(i13, str);
        }
    }
}
