package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import defpackage.e;
import ep.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l0.Eeqr.HOBXIlHxIkMBEA;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FastJsonResponse {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();
        public final Class H;
        public final String K;
        public zan L;
        public final FieldConverter M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f9085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f9087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f9088f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f9089t;

        public Field(int i11, int i12, boolean z11, int i13, boolean z12, String str, int i14, String str2, com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.f9083a = i11;
            this.f9084b = i12;
            this.f9085c = z11;
            this.f9086d = i13;
            this.f9087e = z12;
            this.f9088f = str;
            this.f9089t = i14;
            if (str2 == null) {
                this.H = null;
                this.K = null;
            } else {
                this.H = SafeParcelResponse.class;
                this.K = str2;
            }
            if (zaaVar == null) {
                this.M = null;
                return;
            }
            StringToIntConverter stringToIntConverter = zaaVar.f9079b;
            if (stringToIntConverter == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            this.M = stringToIntConverter;
        }

        public static Field D1(int i11, String str) {
            return new Field(7, true, 7, true, str, i11, null);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            int iQ = SafeParcelWriter.q(parcel, 20293);
            SafeParcelWriter.p(parcel, 1, 4);
            parcel.writeInt(this.f9083a);
            SafeParcelWriter.p(parcel, 2, 4);
            parcel.writeInt(this.f9084b);
            SafeParcelWriter.p(parcel, 3, 4);
            parcel.writeInt(this.f9085c ? 1 : 0);
            SafeParcelWriter.p(parcel, 4, 4);
            parcel.writeInt(this.f9086d);
            SafeParcelWriter.p(parcel, 5, 4);
            parcel.writeInt(this.f9087e ? 1 : 0);
            SafeParcelWriter.k(parcel, 6, this.f9088f, false);
            SafeParcelWriter.p(parcel, 7, 4);
            parcel.writeInt(this.f9089t);
            com.google.android.gms.common.server.converter.zaa zaaVar = null;
            String str = this.K;
            if (str == null) {
                str = null;
            }
            SafeParcelWriter.k(parcel, 8, str, false);
            FieldConverter fieldConverter = this.M;
            if (fieldConverter != null) {
                if (!(fieldConverter instanceof StringToIntConverter)) {
                    Parcelable.Creator<com.google.android.gms.common.server.converter.zaa> creator = com.google.android.gms.common.server.converter.zaa.CREATOR;
                    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
                }
                zaaVar = new com.google.android.gms.common.server.converter.zaa((StringToIntConverter) fieldConverter);
            }
            SafeParcelWriter.j(parcel, 9, zaaVar, i11, false);
            SafeParcelWriter.r(parcel, iQ);
        }

        public final String toString() {
            Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
            toStringHelper.a(Integer.valueOf(this.f9083a), "versionCode");
            toStringHelper.a(Integer.valueOf(this.f9084b), "typeIn");
            toStringHelper.a(Boolean.valueOf(this.f9085c), "typeInArray");
            toStringHelper.a(Integer.valueOf(this.f9086d), HOBXIlHxIkMBEA.YjwNMpArrtuz);
            toStringHelper.a(Boolean.valueOf(this.f9087e), "typeOutArray");
            toStringHelper.a(this.f9088f, "outputFieldName");
            toStringHelper.a(Integer.valueOf(this.f9089t), "safeParcelFieldId");
            String str = this.K;
            if (str == null) {
                str = null;
            }
            toStringHelper.a(str, "concreteTypeName");
            Class cls = this.H;
            if (cls != null) {
                toStringHelper.a(cls.getCanonicalName(), "concreteType.class");
            }
            FieldConverter fieldConverter = this.M;
            if (fieldConverter != null) {
                toStringHelper.a(fieldConverter.getClass().getCanonicalName(), "converterName");
            }
            return toStringHelper.toString();
        }

        public Field(int i11, boolean z11, int i12, boolean z12, String str, int i13, Class cls) {
            this.f9083a = 1;
            this.f9084b = i11;
            this.f9085c = z11;
            this.f9086d = i12;
            this.f9087e = z12;
            this.f9088f = str;
            this.f9089t = i13;
            this.H = cls;
            if (cls == null) {
                this.K = null;
            } else {
                this.K = cls.getCanonicalName();
            }
            this.M = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface FieldConverter<I, O> {
        String Y(Object obj);
    }

    public static final void g(StringBuilder sb2, Field field, Object obj) {
        int i11 = field.f9084b;
        if (i11 == 11) {
            Class cls = field.H;
            Preconditions.g(cls);
            sb2.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i11 != 7) {
                sb2.append(obj);
                return;
            }
            sb2.append("\"");
            sb2.append(JsonUtils.a((String) obj));
            sb2.append("\"");
        }
    }

    public abstract Map a();

    public Object b(Field field) {
        String str = field.f9088f;
        if (field.H == null) {
            return c();
        }
        if (c() != null) {
            throw new IllegalStateException(a.e("Concrete field shouldn't be value object: ", str));
        }
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String strSubstring = str.substring(1);
            StringBuilder sb2 = new StringBuilder(String.valueOf(upperCase).length() + 3 + String.valueOf(strSubstring).length());
            sb2.append("get");
            sb2.append(upperCase);
            sb2.append(strSubstring);
            return getClass().getMethod(sb2.toString(), null).invoke(this, null);
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }

    public abstract Object c();

    public boolean d(Field field) {
        if (field.f9086d != 11) {
            return e();
        }
        if (field.f9087e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean e();

    public String toString() {
        Map mapA = a();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str : mapA.keySet()) {
            Field field = (Field) mapA.get(str);
            if (d(field)) {
                Object objB = b(field);
                FieldConverter fieldConverter = field.M;
                if (fieldConverter != null) {
                    objB = fieldConverter.Y(objB);
                }
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                e.C(sb2, "\"", str, "\":");
                if (objB == null) {
                    sb2.append("null");
                } else {
                    switch (field.f9086d) {
                        case 8:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) objB, 0));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) objB, 10));
                            sb2.append("\"");
                            break;
                        case 10:
                            MapUtils.a(sb2, (HashMap) objB);
                            break;
                        default:
                            if (field.f9085c) {
                                ArrayList arrayList = (ArrayList) objB;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    if (i11 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i11);
                                    if (obj != null) {
                                        g(sb2, field, obj);
                                    }
                                }
                                sb2.append(tcppUUQxZjFdy.ohTOrBNgo);
                            } else {
                                g(sb2, field, objB);
                            }
                            break;
                    }
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append("{}");
        }
        return sb2.toString();
    }
}
