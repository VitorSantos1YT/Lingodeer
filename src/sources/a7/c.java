package a7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import b7.y;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Lists;
import com.google.common.net.MediaType;
import com.yalantis.ucrop.view.CropImageView;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import p7.z;
import r8.n;
import x7.m;
import y6.p0;
import y6.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f430a;

    public /* synthetic */ c(int i11) {
        this.f430a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x032c  */
    /* JADX WARN: Code duplicated, block: B:103:0x033a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0342  */
    /* JADX WARN: Code duplicated, block: B:108:0x034e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0351  */
    /* JADX WARN: Code duplicated, block: B:112:0x035b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0369  */
    /* JADX WARN: Code duplicated, block: B:117:0x0370  */
    /* JADX WARN: Code duplicated, block: B:120:0x037a  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:75:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:78:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x02df  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0302  */
    /* JADX WARN: Code duplicated, block: B:93:0x030f  */
    /* JADX WARN: Code duplicated, block: B:96:0x031b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0322  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v38, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        ?? r17;
        Bitmap bitmapDecodeByteArray;
        String str;
        float f5;
        int i11;
        String str2;
        int i12;
        String str3;
        float f11;
        String str4;
        int i13;
        String str5;
        float f12;
        int i14;
        String str6;
        float f13;
        String str7;
        int i15;
        boolean z11;
        boolean z12;
        String str8;
        float f14;
        String str9;
        String str10;
        int i16 = 2;
        int i17 = 1;
        switch (this.f430a) {
            case 0:
                return Integer.valueOf(((b) obj).f429r);
            case 1:
                String str11 = (String) obj;
                if (MediaType.f17476g.n(str11) && !str11.isEmpty()) {
                    return str11;
                }
                StringBuilder sb2 = new StringBuilder(str11.length() + 16);
                sb2.append('\"');
                for (int i18 = 0; i18 < str11.length(); i18++) {
                    char cCharAt = str11.charAt(i18);
                    if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                        sb2.append('\\');
                    }
                    sb2.append(cCharAt);
                }
                sb2.append('\"');
                return sb2.toString();
            case 2:
                return ImmutableMultiset.k((Collection) obj);
            case 3:
                return new g7.f((y) obj);
            case 4:
                return ImmutableList.u(Integer.valueOf(((q7.g) obj).f47536a));
            case 5:
                m mVar = (m) obj;
                mVar.getClass();
                return mVar.getClass().getSimpleName();
            case 6:
                return ImmutableList.n(Lists.e(((z) obj).t().f46389b, new c(7)));
            case 7:
                return Integer.valueOf(((p0) obj).f57306c);
            case 8:
                return Long.valueOf(((u8.a) obj).f52819b);
            case 9:
                return Long.valueOf(((u8.a) obj).f52820c);
            case 10:
                return (n) obj;
            case 11:
                Bundle bundle = (Bundle) obj;
                ?? charSequence = bundle.getCharSequence(b.f405s);
                if (charSequence != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(b.f406t);
                    if (parcelableArrayList != null) {
                        charSequence = SpannableString.valueOf(charSequence);
                        int size = parcelableArrayList.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj2 = parcelableArrayList.get(i19);
                            i19++;
                            Bundle bundle2 = (Bundle) obj2;
                            int i21 = bundle2.getInt(e.f434a);
                            int i22 = bundle2.getInt(e.f435b);
                            int i23 = bundle2.getInt(e.f436c);
                            int i24 = bundle2.getInt(e.f437d, -1);
                            Bundle bundle3 = bundle2.getBundle(e.f438e);
                            if (i24 == i17) {
                                bundle3.getClass();
                                String string = bundle3.getString(h.f439c);
                                string.getClass();
                                charSequence.setSpan(new h(string, bundle3.getInt(h.f440d)), i21, i22, i23);
                            } else if (i24 == i16) {
                                bundle3.getClass();
                                charSequence.setSpan(new i(bundle3.getInt(i.f443d), bundle3.getInt(i.f444e), bundle3.getInt(i.f445f)), i21, i22, i23);
                            } else if (i24 == 3) {
                                charSequence.setSpan(new f(), i21, i22, i23);
                            } else if (i24 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(j.f449b);
                                string2.getClass();
                                charSequence.setSpan(new j(string2), i21, i22, i23);
                            }
                            i16 = 2;
                            i17 = 1;
                        }
                    }
                } else {
                    charSequence = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(b.f407u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(b.f408v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(b.f409w);
                if (bitmap == null) {
                    byte[] byteArray = bundle.getByteArray(b.f410x);
                    if (byteArray != null) {
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    } else {
                        r17 = charSequence;
                        bitmapDecodeByteArray = null;
                    }
                    str = b.f411y;
                    if (bundle.containsKey(str)) {
                        str10 = b.f412z;
                        if (bundle.containsKey(str10)) {
                            f5 = bundle.getFloat(str);
                            i11 = bundle.getInt(str10);
                        } else {
                            f5 = -3.4028235E38f;
                            i11 = Integer.MIN_VALUE;
                        }
                    } else {
                        f5 = -3.4028235E38f;
                        i11 = Integer.MIN_VALUE;
                    }
                    str2 = b.A;
                    if (bundle.containsKey(str2)) {
                        i12 = bundle.getInt(str2);
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    str3 = b.B;
                    if (bundle.containsKey(str3)) {
                        f11 = bundle.getFloat(str3);
                    } else {
                        f11 = -3.4028235E38f;
                    }
                    str4 = b.C;
                    if (bundle.containsKey(str4)) {
                        i13 = bundle.getInt(str4);
                    } else {
                        i13 = Integer.MIN_VALUE;
                    }
                    str5 = b.E;
                    if (bundle.containsKey(str5)) {
                        str9 = b.D;
                        if (bundle.containsKey(str9)) {
                            f12 = bundle.getFloat(str5);
                            i14 = bundle.getInt(str9);
                        } else {
                            f12 = -3.4028235E38f;
                            i14 = Integer.MIN_VALUE;
                        }
                    } else {
                        f12 = -3.4028235E38f;
                        i14 = Integer.MIN_VALUE;
                    }
                    str6 = b.F;
                    if (bundle.containsKey(str6)) {
                        f13 = bundle.getFloat(str6);
                    } else {
                        f13 = -3.4028235E38f;
                    }
                    String str12 = b.G;
                    float f15 = bundle.containsKey(str12) ? bundle.getFloat(str12) : -3.4028235E38f;
                    str7 = b.H;
                    if (bundle.containsKey(str7)) {
                        i15 = bundle.getInt(str7);
                        z11 = true;
                    } else {
                        i15 = -16777216;
                        z11 = false;
                    }
                    int i25 = i15;
                    if (bundle.getBoolean(b.I, false)) {
                        z12 = z11;
                    } else {
                        z12 = false;
                    }
                    String str13 = b.J;
                    int i26 = bundle.containsKey(str13) ? bundle.getInt(str13) : Integer.MIN_VALUE;
                    str8 = b.K;
                    if (bundle.containsKey(str8)) {
                        f14 = bundle.getFloat(str8);
                    } else {
                        f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    float f16 = f14;
                    String str14 = b.L;
                    return new b(r17, alignment2, alignment4, bitmapDecodeByteArray, f5, i11, i12, f11, i13, i14, f12, f13, f15, z12, i25, i26, f16, bundle.containsKey(str14) ? bundle.getInt(str14) : 0);
                }
                bitmapDecodeByteArray = bitmap;
                r17 = 0;
                str = b.f411y;
                if (bundle.containsKey(str)) {
                    str10 = b.f412z;
                    if (bundle.containsKey(str10)) {
                        f5 = bundle.getFloat(str);
                        i11 = bundle.getInt(str10);
                    } else {
                        f5 = -3.4028235E38f;
                        i11 = Integer.MIN_VALUE;
                    }
                } else {
                    f5 = -3.4028235E38f;
                    i11 = Integer.MIN_VALUE;
                }
                str2 = b.A;
                if (bundle.containsKey(str2)) {
                    i12 = bundle.getInt(str2);
                } else {
                    i12 = Integer.MIN_VALUE;
                }
                str3 = b.B;
                if (bundle.containsKey(str3)) {
                    f11 = bundle.getFloat(str3);
                } else {
                    f11 = -3.4028235E38f;
                }
                str4 = b.C;
                if (bundle.containsKey(str4)) {
                    i13 = bundle.getInt(str4);
                } else {
                    i13 = Integer.MIN_VALUE;
                }
                str5 = b.E;
                if (bundle.containsKey(str5)) {
                    str9 = b.D;
                    if (bundle.containsKey(str9)) {
                        f12 = bundle.getFloat(str5);
                        i14 = bundle.getInt(str9);
                    } else {
                        f12 = -3.4028235E38f;
                        i14 = Integer.MIN_VALUE;
                    }
                } else {
                    f12 = -3.4028235E38f;
                    i14 = Integer.MIN_VALUE;
                }
                str6 = b.F;
                if (bundle.containsKey(str6)) {
                    f13 = bundle.getFloat(str6);
                } else {
                    f13 = -3.4028235E38f;
                }
                String str15 = b.G;
                float f17 = bundle.containsKey(str15) ? bundle.getFloat(str15) : -3.4028235E38f;
                str7 = b.H;
                if (bundle.containsKey(str7)) {
                    i15 = bundle.getInt(str7);
                    z11 = true;
                } else {
                    i15 = -16777216;
                    z11 = false;
                }
                int i27 = i15;
                if (bundle.getBoolean(b.I, false)) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                String str16 = b.J;
                int i28 = bundle.containsKey(str16) ? bundle.getInt(str16) : Integer.MIN_VALUE;
                str8 = b.K;
                if (bundle.containsKey(str8)) {
                    f14 = bundle.getFloat(str8);
                } else {
                    f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                float f18 = f14;
                String str17 = b.L;
                return new b(r17, alignment2, alignment4, bitmapDecodeByteArray, f5, i11, i12, f11, i13, i14, f12, f13, f17, z12, i27, i28, f18, bundle.containsKey(str17) ? bundle.getInt(str17) : 0);
            case 12:
                b bVar = (b) obj;
                Bitmap bitmap2 = bVar.f416d;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence2 = bVar.f413a;
                if (charSequence2 != null) {
                    bundle4.putCharSequence(b.f405s, charSequence2);
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str18 = e.f434a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                            hVar.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(h.f439c, hVar.f441a);
                            bundle5.putInt(h.f440d, hVar.f442b);
                            arrayList.add(e.a(spanned, hVar, 1, bundle5));
                        }
                        for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                            iVar.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(i.f443d, iVar.f446a);
                            bundle6.putInt(i.f444e, iVar.f447b);
                            bundle6.putInt(i.f445f, iVar.f448c);
                            arrayList.add(e.a(spanned, iVar, 2, bundle6));
                        }
                        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                            arrayList.add(e.a(spanned, fVar, 3, null));
                        }
                        for (j jVar : (j[]) spanned.getSpans(0, spanned.length(), j.class)) {
                            jVar.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(j.f449b, jVar.f450a);
                            arrayList.add(e.a(spanned, jVar, 4, bundle7));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(b.f406t, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(b.f407u, bVar.f414b);
                bundle4.putSerializable(b.f408v, bVar.f415c);
                bundle4.putFloat(b.f411y, bVar.f417e);
                bundle4.putInt(b.f412z, bVar.f418f);
                bundle4.putInt(b.A, bVar.f419g);
                bundle4.putFloat(b.B, bVar.f420h);
                bundle4.putInt(b.C, bVar.f421i);
                bundle4.putInt(b.D, bVar.f425n);
                bundle4.putFloat(b.E, bVar.f426o);
                bundle4.putFloat(b.F, bVar.f422j);
                bundle4.putFloat(b.G, bVar.f423k);
                bundle4.putBoolean(b.I, bVar.f424l);
                bundle4.putInt(b.H, bVar.m);
                bundle4.putInt(b.J, bVar.f427p);
                bundle4.putFloat(b.K, bVar.f428q);
                bundle4.putInt(b.L, bVar.f429r);
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    b7.a.j(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(b.f410x, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            case 13:
                long j11 = ((u8.a) obj).f52819b;
                if (j11 == -9223372036854775807L) {
                    j11 = 0;
                }
                return Long.valueOf(j11);
            default:
                q qVar = (q) obj;
                return qVar.f57309a + ": " + qVar.f57310b;
        }
    }
}
