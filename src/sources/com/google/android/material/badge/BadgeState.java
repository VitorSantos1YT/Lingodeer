package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BadgeState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final State f13880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final State f13881b = new State();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f13885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f13886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f13887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f13889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f13890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13891l;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                State state = new State();
                state.K = 255;
                state.M = -2;
                state.N = -2;
                state.O = -2;
                state.V = Boolean.TRUE;
                state.f13892a = parcel.readInt();
                state.f13894b = (Integer) parcel.readSerializable();
                state.f13896c = (Integer) parcel.readSerializable();
                state.f13898d = (Integer) parcel.readSerializable();
                state.f13900e = (Integer) parcel.readSerializable();
                state.f13902f = (Integer) parcel.readSerializable();
                state.f13905t = (Integer) parcel.readSerializable();
                state.H = (Integer) parcel.readSerializable();
                state.K = parcel.readInt();
                state.L = parcel.readString();
                state.M = parcel.readInt();
                state.N = parcel.readInt();
                state.O = parcel.readInt();
                state.Q = parcel.readString();
                state.R = parcel.readString();
                state.S = parcel.readInt();
                state.U = (Integer) parcel.readSerializable();
                state.W = (Integer) parcel.readSerializable();
                state.X = (Integer) parcel.readSerializable();
                state.Y = (Integer) parcel.readSerializable();
                state.Z = (Integer) parcel.readSerializable();
                state.f13893a0 = (Integer) parcel.readSerializable();
                state.f13895b0 = (Integer) parcel.readSerializable();
                state.f13901e0 = (Integer) parcel.readSerializable();
                state.f13897c0 = (Integer) parcel.readSerializable();
                state.f13899d0 = (Integer) parcel.readSerializable();
                state.V = (Boolean) parcel.readSerializable();
                state.P = (Locale) parcel.readSerializable();
                state.f13903f0 = (Boolean) parcel.readSerializable();
                state.f13904g0 = (Integer) parcel.readSerializable();
                return state;
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i11) {
                return new State[i11];
            }
        };
        public Integer H;
        public String L;
        public Locale P;
        public CharSequence Q;
        public CharSequence R;
        public int S;
        public int T;
        public Integer U;
        public Integer W;
        public Integer X;
        public Integer Y;
        public Integer Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13892a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public Integer f13893a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f13894b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public Integer f13895b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f13896c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public Integer f13897c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f13898d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public Integer f13899d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f13900e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public Integer f13901e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f13902f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public Boolean f13903f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public Integer f13904g0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Integer f13905t;
        public int K = 255;
        public int M = -2;
        public int N = -2;
        public int O = -2;
        public Boolean V = Boolean.TRUE;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f13892a);
            parcel.writeSerializable(this.f13894b);
            parcel.writeSerializable(this.f13896c);
            parcel.writeSerializable(this.f13898d);
            parcel.writeSerializable(this.f13900e);
            parcel.writeSerializable(this.f13902f);
            parcel.writeSerializable(this.f13905t);
            parcel.writeSerializable(this.H);
            parcel.writeInt(this.K);
            parcel.writeString(this.L);
            parcel.writeInt(this.M);
            parcel.writeInt(this.N);
            parcel.writeInt(this.O);
            CharSequence charSequence = this.Q;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.R;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.S);
            parcel.writeSerializable(this.U);
            parcel.writeSerializable(this.W);
            parcel.writeSerializable(this.X);
            parcel.writeSerializable(this.Y);
            parcel.writeSerializable(this.Z);
            parcel.writeSerializable(this.f13893a0);
            parcel.writeSerializable(this.f13895b0);
            parcel.writeSerializable(this.f13901e0);
            parcel.writeSerializable(this.f13897c0);
            parcel.writeSerializable(this.f13899d0);
            parcel.writeSerializable(this.V);
            parcel.writeSerializable(this.P);
            parcel.writeSerializable(this.f13903f0);
            parcel.writeSerializable(this.f13904g0);
        }
    }

    public BadgeState(Context context, State state) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        state = state == null ? new State() : state;
        int i11 = state.f13892a;
        if (i11 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i11);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e8) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i11));
                notFoundException.initCause(e8);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = ThemeEnforcement.d(context, attributeSetAsAttributeSet, R.styleable.f13733c, com.lingodeer.R.attr.badgeStyle, styleAttribute == 0 ? com.lingodeer.R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f13882c = typedArrayD.getDimensionPixelSize(5, -1);
        this.f13888i = context.getResources().getDimensionPixelSize(com.lingodeer.R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f13889j = context.getResources().getDimensionPixelSize(com.lingodeer.R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f13883d = typedArrayD.getDimensionPixelSize(15, -1);
        this.f13884e = typedArrayD.getDimension(13, resources.getDimension(com.lingodeer.R.dimen.m3_badge_size));
        this.f13886g = typedArrayD.getDimension(18, resources.getDimension(com.lingodeer.R.dimen.m3_badge_with_text_size));
        this.f13885f = typedArrayD.getDimension(4, resources.getDimension(com.lingodeer.R.dimen.m3_badge_size));
        this.f13887h = typedArrayD.getDimension(14, resources.getDimension(com.lingodeer.R.dimen.m3_badge_with_text_size));
        this.f13890k = typedArrayD.getInt(25, 1);
        this.f13891l = typedArrayD.getInt(2, 0);
        State state2 = this.f13881b;
        int i12 = state.K;
        state2.K = i12 == -2 ? 255 : i12;
        int i13 = state.M;
        if (i13 != -2) {
            state2.M = i13;
        } else if (typedArrayD.hasValue(24)) {
            this.f13881b.M = typedArrayD.getInt(24, 0);
        } else {
            this.f13881b.M = -1;
        }
        String str = state.L;
        if (str != null) {
            this.f13881b.L = str;
        } else if (typedArrayD.hasValue(8)) {
            this.f13881b.L = typedArrayD.getString(8);
        }
        State state3 = this.f13881b;
        state3.Q = state.Q;
        CharSequence charSequence = state.R;
        state3.R = charSequence == null ? context.getString(com.lingodeer.R.string.mtrl_badge_numberless_content_description) : charSequence;
        State state4 = this.f13881b;
        int i14 = state.S;
        state4.S = i14 == 0 ? com.lingodeer.R.plurals.mtrl_badge_content_description : i14;
        int i15 = state.T;
        state4.T = i15 == 0 ? com.lingodeer.R.string.mtrl_exceed_max_badge_number_content_description : i15;
        Boolean bool = state.V;
        state4.V = Boolean.valueOf(bool == null || bool.booleanValue());
        State state5 = this.f13881b;
        int i16 = state.N;
        state5.N = i16 == -2 ? typedArrayD.getInt(22, -2) : i16;
        State state6 = this.f13881b;
        int i17 = state.O;
        state6.O = i17 == -2 ? typedArrayD.getInt(23, -2) : i17;
        State state7 = this.f13881b;
        Integer num = state.f13900e;
        state7.f13900e = Integer.valueOf(num == null ? typedArrayD.getResourceId(6, com.lingodeer.R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        State state8 = this.f13881b;
        Integer num2 = state.f13902f;
        state8.f13902f = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(7, 0) : num2.intValue());
        State state9 = this.f13881b;
        Integer num3 = state.f13905t;
        state9.f13905t = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(16, com.lingodeer.R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        State state10 = this.f13881b;
        Integer num4 = state.H;
        state10.H = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(17, 0) : num4.intValue());
        State state11 = this.f13881b;
        Integer num5 = state.f13894b;
        state11.f13894b = Integer.valueOf(num5 == null ? MaterialResources.a(context, typedArrayD, 1).getDefaultColor() : num5.intValue());
        State state12 = this.f13881b;
        Integer num6 = state.f13898d;
        state12.f13898d = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(9, com.lingodeer.R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = state.f13896c;
        if (num7 != null) {
            this.f13881b.f13896c = num7;
        } else if (typedArrayD.hasValue(10)) {
            this.f13881b.f13896c = Integer.valueOf(MaterialResources.a(context, typedArrayD, 10).getDefaultColor());
        } else {
            this.f13881b.f13896c = Integer.valueOf(new TextAppearance(context, this.f13881b.f13898d.intValue()).f15094k.getDefaultColor());
        }
        State state13 = this.f13881b;
        Integer num8 = state.U;
        state13.U = Integer.valueOf(num8 == null ? typedArrayD.getInt(3, 8388661) : num8.intValue());
        State state14 = this.f13881b;
        Integer num9 = state.W;
        state14.W = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelSize(12, resources.getDimensionPixelSize(com.lingodeer.R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        State state15 = this.f13881b;
        Integer num10 = state.X;
        state15.X = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelSize(11, resources.getDimensionPixelSize(com.lingodeer.R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        State state16 = this.f13881b;
        Integer num11 = state.Y;
        state16.Y = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(19, 0) : num11.intValue());
        State state17 = this.f13881b;
        Integer num12 = state.Z;
        state17.Z = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(26, 0) : num12.intValue());
        State state18 = this.f13881b;
        Integer num13 = state.f13893a0;
        state18.f13893a0 = Integer.valueOf(num13 == null ? typedArrayD.getDimensionPixelOffset(20, state18.Y.intValue()) : num13.intValue());
        State state19 = this.f13881b;
        Integer num14 = state.f13895b0;
        state19.f13895b0 = Integer.valueOf(num14 == null ? typedArrayD.getDimensionPixelOffset(27, state19.Z.intValue()) : num14.intValue());
        State state20 = this.f13881b;
        Integer num15 = state.f13901e0;
        state20.f13901e0 = Integer.valueOf(num15 == null ? typedArrayD.getDimensionPixelOffset(21, 0) : num15.intValue());
        State state21 = this.f13881b;
        Integer num16 = state.f13897c0;
        state21.f13897c0 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        State state22 = this.f13881b;
        Integer num17 = state.f13899d0;
        state22.f13899d0 = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        State state23 = this.f13881b;
        Boolean bool2 = state.f13903f0;
        state23.f13903f0 = Boolean.valueOf(bool2 == null ? typedArrayD.getBoolean(0, false) : bool2.booleanValue());
        typedArrayD.recycle();
        Locale locale = state.P;
        if (locale == null) {
            this.f13881b.P = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f13881b.P = locale;
        }
        this.f13880a = state;
    }
}
