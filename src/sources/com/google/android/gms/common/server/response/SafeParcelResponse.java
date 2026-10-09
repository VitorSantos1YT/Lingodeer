package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import defpackage.e;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcel f9091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zan f9093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9095f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9096t;

    public SafeParcelResponse(int i11, Parcel parcel, zan zanVar) {
        this.f9090a = i11;
        Preconditions.g(parcel);
        this.f9091b = parcel;
        this.f9092c = 2;
        this.f9093d = zanVar;
        this.f9094e = zanVar == null ? null : zanVar.f9105c;
        this.f9095f = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v50, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void j(StringBuilder sb2, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel parcelObtain;
        BigInteger[] bigIntegerArr;
        long[] jArrCreateLongArray;
        float[] fArrCreateFloatArray;
        double[] dArrCreateDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] zArrCreateBooleanArray;
        Parcel[] parcelArr;
        Object bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).f9089t, entry);
        }
        sb2.append('{');
        int iX = SafeParcelReader.x(parcel);
        boolean z11 = false;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i11);
            if (entry2 != null) {
                if (z11) {
                    sb2.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                e.C(sb2, "\"", str, "\":");
                FastJsonResponse.FieldConverter fieldConverter = field.M;
                String str2 = field.K;
                FastJsonResponse.FieldConverter fieldConverter2 = field.M;
                int i12 = field.f9086d;
                if (fieldConverter != null) {
                    switch (i12) {
                        case 0:
                            Object objValueOf = Integer.valueOf(SafeParcelReader.r(parcel, i11));
                            if (fieldConverter2 != 0) {
                                objValueOf = fieldConverter2.Y(objValueOf);
                            }
                            l(sb2, field, objValueOf);
                            break;
                        case 1:
                            int iV = SafeParcelReader.v(parcel, i11);
                            int iDataPosition = parcel.dataPosition();
                            if (iV == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iV);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            if (fieldConverter2 != 0) {
                                bigInteger2 = fieldConverter2.Y(bigInteger2);
                            }
                            l(sb2, field, bigInteger2);
                            break;
                        case 2:
                            Object objValueOf2 = Long.valueOf(SafeParcelReader.t(parcel, i11));
                            if (fieldConverter2 != 0) {
                                objValueOf2 = fieldConverter2.Y(objValueOf2);
                            }
                            l(sb2, field, objValueOf2);
                            break;
                        case 3:
                            Object objValueOf3 = Float.valueOf(SafeParcelReader.p(parcel, i11));
                            if (fieldConverter2 != 0) {
                                objValueOf3 = fieldConverter2.Y(objValueOf3);
                            }
                            l(sb2, field, objValueOf3);
                            break;
                        case 4:
                            SafeParcelReader.y(parcel, i11, 8);
                            Object objValueOf4 = Double.valueOf(parcel.readDouble());
                            if (fieldConverter2 != 0) {
                                objValueOf4 = fieldConverter2.Y(objValueOf4);
                            }
                            l(sb2, field, objValueOf4);
                            break;
                        case 5:
                            Object objA = SafeParcelReader.a(parcel, i11);
                            if (fieldConverter2 != 0) {
                                objA = fieldConverter2.Y(objA);
                            }
                            l(sb2, field, objA);
                            break;
                        case 6:
                            Object objValueOf5 = Boolean.valueOf(SafeParcelReader.m(parcel, i11));
                            if (fieldConverter2 != 0) {
                                objValueOf5 = fieldConverter2.Y(objValueOf5);
                            }
                            l(sb2, field, objValueOf5);
                            break;
                        case 7:
                            String strG = SafeParcelReader.g(parcel, i11);
                            if (fieldConverter2 != 0) {
                                strG = fieldConverter2.Y(strG);
                            }
                            l(sb2, field, strG);
                            break;
                        case 8:
                        case 9:
                            Object objC = SafeParcelReader.c(parcel, i11);
                            if (fieldConverter2 != 0) {
                                objC = fieldConverter2.Y(objC);
                            }
                            l(sb2, field, objC);
                            break;
                        case 10:
                            Bundle bundleB = SafeParcelReader.b(parcel, i11);
                            Object map2 = new HashMap();
                            for (String str3 : bundleB.keySet()) {
                                String string = bundleB.getString(str3);
                                Preconditions.g(string);
                                map2.put(str3, string);
                            }
                            if (fieldConverter2 != 0) {
                                map2 = fieldConverter2.Y(map2);
                            }
                            l(sb2, field, map2);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(e.g(i12, "Unknown field out type = ", new StringBuilder(String.valueOf(i12).length() + 25)));
                    }
                } else if (field.f9087e) {
                    sb2.append("[");
                    switch (i12) {
                        case 0:
                            int[] iArrE = SafeParcelReader.e(parcel, i11);
                            int length = iArrE.length;
                            for (int i13 = 0; i13 < length; i13++) {
                                if (i13 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(iArrE[i13]);
                            }
                            break;
                        case 1:
                            int iV2 = SafeParcelReader.v(parcel, i11);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iV2 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int i14 = parcel.readInt();
                                bigIntegerArr = new BigInteger[i14];
                                for (int i15 = 0; i15 < i14; i15++) {
                                    bigIntegerArr[i15] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(iDataPosition2 + iV2);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i16 = 0; i16 < length2; i16++) {
                                if (i16 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(bigIntegerArr[i16]);
                            }
                            break;
                        case 2:
                            int iV3 = SafeParcelReader.v(parcel, i11);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iV3 == 0) {
                                jArrCreateLongArray = null;
                            } else {
                                jArrCreateLongArray = parcel.createLongArray();
                                parcel.setDataPosition(iDataPosition3 + iV3);
                            }
                            int length3 = jArrCreateLongArray.length;
                            for (int i17 = 0; i17 < length3; i17++) {
                                if (i17 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(jArrCreateLongArray[i17]);
                            }
                            break;
                        case 3:
                            int iV4 = SafeParcelReader.v(parcel, i11);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iV4 == 0) {
                                fArrCreateFloatArray = null;
                            } else {
                                fArrCreateFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(iDataPosition4 + iV4);
                            }
                            int length4 = fArrCreateFloatArray.length;
                            for (int i18 = 0; i18 < length4; i18++) {
                                if (i18 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(fArrCreateFloatArray[i18]);
                            }
                            break;
                        case 4:
                            int iV5 = SafeParcelReader.v(parcel, i11);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iV5 == 0) {
                                dArrCreateDoubleArray = null;
                            } else {
                                dArrCreateDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(iDataPosition5 + iV5);
                            }
                            int length5 = dArrCreateDoubleArray.length;
                            for (int i19 = 0; i19 < length5; i19++) {
                                if (i19 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(dArrCreateDoubleArray[i19]);
                            }
                            break;
                        case 5:
                            int iV6 = SafeParcelReader.v(parcel, i11);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iV6 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int i21 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[i21];
                                for (int i22 = 0; i22 < i21; i22++) {
                                    bigDecimalArr[i22] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(iDataPosition6 + iV6);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i23 = 0; i23 < length6; i23++) {
                                if (i23 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(bigDecimalArr[i23]);
                            }
                            break;
                        case 6:
                            int iV7 = SafeParcelReader.v(parcel, i11);
                            int iDataPosition7 = parcel.dataPosition();
                            if (iV7 == 0) {
                                zArrCreateBooleanArray = null;
                            } else {
                                zArrCreateBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(iDataPosition7 + iV7);
                            }
                            int length7 = zArrCreateBooleanArray.length;
                            for (int i24 = 0; i24 < length7; i24++) {
                                if (i24 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(zArrCreateBooleanArray[i24]);
                            }
                            break;
                        case 7:
                            String[] strArrH = SafeParcelReader.h(parcel, i11);
                            int length8 = strArrH.length;
                            for (int i25 = 0; i25 < length8; i25++) {
                                if (i25 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append("\"");
                                sb2.append(strArrH[i25]);
                                sb2.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int iV8 = SafeParcelReader.v(parcel, i11);
                            int iDataPosition8 = parcel.dataPosition();
                            if (iV8 == 0) {
                                parcelArr = null;
                            } else {
                                int i26 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[i26];
                                for (int i27 = 0; i27 < i26; i27++) {
                                    int i28 = parcel.readInt();
                                    if (i28 != 0) {
                                        int iDataPosition9 = parcel.dataPosition();
                                        Parcel parcelObtain2 = Parcel.obtain();
                                        parcelObtain2.appendFrom(parcel, iDataPosition9, i28);
                                        parcelArr2[i27] = parcelObtain2;
                                        parcel.setDataPosition(iDataPosition9 + i28);
                                    } else {
                                        parcelArr2[i27] = null;
                                    }
                                }
                                parcel.setDataPosition(iDataPosition8 + iV8);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i29 = 0; i29 < length9; i29++) {
                                if (i29 > 0) {
                                    sb2.append(",");
                                }
                                parcelArr[i29].setDataPosition(0);
                                Preconditions.g(str2);
                                Preconditions.g(field.L);
                                Map map3 = (Map) field.L.f9104b.get(str2);
                                Preconditions.g(map3);
                                j(sb2, map3, parcelArr[i29]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb2.append("]");
                } else {
                    switch (i12) {
                        case 0:
                            sb2.append(SafeParcelReader.r(parcel, i11));
                            break;
                        case 1:
                            int iV9 = SafeParcelReader.v(parcel, i11);
                            int iDataPosition10 = parcel.dataPosition();
                            if (iV9 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition10 + iV9);
                                bigInteger = new BigInteger(bArrCreateByteArray2);
                            }
                            sb2.append(bigInteger);
                            break;
                        case 2:
                            sb2.append(SafeParcelReader.t(parcel, i11));
                            break;
                        case 3:
                            sb2.append(SafeParcelReader.p(parcel, i11));
                            break;
                        case 4:
                            SafeParcelReader.y(parcel, i11, 8);
                            sb2.append(parcel.readDouble());
                            break;
                        case 5:
                            sb2.append(SafeParcelReader.a(parcel, i11));
                            break;
                        case 6:
                            sb2.append(SafeParcelReader.m(parcel, i11));
                            break;
                        case 7:
                            String strG2 = SafeParcelReader.g(parcel, i11);
                            sb2.append("\"");
                            sb2.append(JsonUtils.a(strG2));
                            sb2.append("\"");
                            break;
                        case 8:
                            byte[] bArrC = SafeParcelReader.c(parcel, i11);
                            sb2.append("\"");
                            sb2.append(bArrC == null ? null : Base64.encodeToString(bArrC, 0));
                            sb2.append("\"");
                            break;
                        case 9:
                            byte[] bArrC2 = SafeParcelReader.c(parcel, i11);
                            sb2.append("\"");
                            sb2.append(bArrC2 == null ? null : Base64.encodeToString(bArrC2, 10));
                            sb2.append("\"");
                            break;
                        case 10:
                            Bundle bundleB2 = SafeParcelReader.b(parcel, i11);
                            Set<String> setKeySet = bundleB2.keySet();
                            sb2.append("{");
                            boolean z12 = true;
                            for (String str4 : setKeySet) {
                                if (!z12) {
                                    sb2.append(",");
                                }
                                e.C(sb2, "\"", str4, "\":\"");
                                sb2.append(JsonUtils.a(bundleB2.getString(str4)));
                                sb2.append("\"");
                                z12 = false;
                            }
                            sb2.append("}");
                            break;
                        case 11:
                            int iV10 = SafeParcelReader.v(parcel, i11);
                            int iDataPosition11 = parcel.dataPosition();
                            if (iV10 == 0) {
                                parcelObtain = null;
                            } else {
                                parcelObtain = Parcel.obtain();
                                parcelObtain.appendFrom(parcel, iDataPosition11, iV10);
                                parcel.setDataPosition(iDataPosition11 + iV10);
                            }
                            parcelObtain.setDataPosition(0);
                            Preconditions.g(str2);
                            Preconditions.g(field.L);
                            Map map4 = (Map) field.L.f9104b.get(str2);
                            Preconditions.g(map4);
                            j(sb2, map4, parcelObtain);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z11 = true;
            }
        }
        if (parcel.dataPosition() != iX) {
            throw new SafeParcelReader.ParseException(e.g(iX, "Overread allowed size end=", new StringBuilder(String.valueOf(iX).length() + 26)), parcel);
        }
        sb2.append('}');
    }

    public static final void k(StringBuilder sb2, int i11, Object obj) {
        switch (i11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                Preconditions.g(obj);
                sb2.append(JsonUtils.a(obj.toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                byte[] bArr = (byte[]) obj;
                sb2.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb2.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb2.append("\"");
                return;
            case 10:
                Preconditions.g(obj);
                MapUtils.a(sb2, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(e.g(i11, "Unknown type = ", new StringBuilder(String.valueOf(i11).length() + 15)));
        }
    }

    public static final void l(StringBuilder sb2, FastJsonResponse.Field field, Object obj) {
        boolean z11 = field.f9085c;
        int i11 = field.f9084b;
        if (!z11) {
            k(sb2, i11, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 != 0) {
                sb2.append(",");
            }
            k(sb2, i11, arrayList.get(i12));
        }
        sb2.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map a() {
        zan zanVar = this.f9093d;
        if (zanVar == null) {
            return null;
        }
        String str = this.f9094e;
        Preconditions.g(str);
        return (Map) zanVar.f9104b.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object c() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean e() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel i() {
        int i11 = this.f9095f;
        Parcel parcel = this.f9091b;
        if (i11 != 0) {
            if (i11 != 1) {
                return parcel;
            }
            SafeParcelWriter.r(parcel, this.f9096t);
            this.f9095f = 2;
            return parcel;
        }
        int iQ = SafeParcelWriter.q(parcel, 20293);
        this.f9096t = iQ;
        SafeParcelWriter.r(parcel, iQ);
        this.f9095f = 2;
        return parcel;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        zan zanVar = this.f9093d;
        Preconditions.h(zanVar, "Cannot convert to JSON on client side.");
        Parcel parcelI = i();
        parcelI.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        String str = this.f9094e;
        Preconditions.g(str);
        Map map = (Map) zanVar.f9104b.get(str);
        Preconditions.g(map);
        j(sb2, map, parcelI);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9090a);
        Parcel parcelI = i();
        if (parcelI != null) {
            int iQ2 = SafeParcelWriter.q(parcel, 2);
            parcel.appendFrom(parcelI, 0, parcelI.dataSize());
            SafeParcelWriter.r(parcel, iQ2);
        }
        SafeParcelWriter.j(parcel, 3, this.f9092c != 0 ? this.f9093d : null, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
