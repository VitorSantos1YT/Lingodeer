package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        long jT = 0;
        long jT2 = 0;
        long jT3 = 0;
        long jT4 = 0;
        long jT5 = 0;
        long jT6 = 0;
        long jT7 = 0;
        long jT8 = 0;
        boolean zM = false;
        int iR = 0;
        boolean zM2 = false;
        boolean zM3 = false;
        int iR2 = 0;
        int iR3 = 0;
        String strG = BuildConfig.VERSION_NAME;
        String strG2 = strG;
        String strG3 = strG2;
        String strG4 = strG3;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        String strG8 = null;
        String strG9 = null;
        String strG10 = null;
        Boolean boolN = null;
        ArrayList arrayListI = null;
        String strG11 = null;
        String strG12 = null;
        int iR4 = 100;
        boolean zM4 = true;
        boolean zM5 = true;
        long jT9 = -2147483648L;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 2:
                    strG5 = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    strG6 = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    strG7 = SafeParcelReader.g(parcel, i11);
                    break;
                case 5:
                    strG8 = SafeParcelReader.g(parcel, i11);
                    break;
                case 6:
                    jT = SafeParcelReader.t(parcel, i11);
                    break;
                case 7:
                    jT2 = SafeParcelReader.t(parcel, i11);
                    break;
                case '\b':
                    strG9 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\t':
                    zM4 = SafeParcelReader.m(parcel, i11);
                    break;
                case '\n':
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 11:
                    jT9 = SafeParcelReader.t(parcel, i11);
                    break;
                case '\f':
                    strG10 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\r':
                case 17:
                case 19:
                case 20:
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                case '!':
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
                case 14:
                    jT3 = SafeParcelReader.t(parcel, i11);
                    break;
                case 15:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 16:
                    zM5 = SafeParcelReader.m(parcel, i11);
                    break;
                case 18:
                    zM2 = SafeParcelReader.m(parcel, i11);
                    break;
                case 21:
                    boolN = SafeParcelReader.n(parcel, i11);
                    break;
                case 22:
                    jT4 = SafeParcelReader.t(parcel, i11);
                    break;
                case 23:
                    arrayListI = SafeParcelReader.i(parcel, i11);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 27:
                    strG11 = SafeParcelReader.g(parcel, i11);
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    zM3 = SafeParcelReader.m(parcel, i11);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    jT5 = SafeParcelReader.t(parcel, i11);
                    break;
                case 30:
                    iR4 = SafeParcelReader.r(parcel, i11);
                    break;
                case 31:
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case Consts.SP /* 32 */:
                    iR2 = SafeParcelReader.r(parcel, i11);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    jT6 = SafeParcelReader.t(parcel, i11);
                    break;
                case '#':
                    strG12 = SafeParcelReader.g(parcel, i11);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    strG4 = SafeParcelReader.g(parcel, i11);
                    break;
                case '%':
                    jT7 = SafeParcelReader.t(parcel, i11);
                    break;
                case '&':
                    iR3 = SafeParcelReader.r(parcel, i11);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    jT8 = SafeParcelReader.t(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzr(strG5, strG6, strG7, strG8, jT, jT2, strG9, zM4, zM, jT9, strG10, jT3, iR, zM5, zM2, boolN, jT4, arrayListI, strG, strG2, strG11, zM3, jT5, iR4, strG3, iR2, jT6, strG12, strG4, jT7, iR3, jT8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzr[i11];
    }
}
