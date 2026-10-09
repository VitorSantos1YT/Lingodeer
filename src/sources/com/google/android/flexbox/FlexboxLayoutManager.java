package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties;
import androidx.recyclerview.widget.a2;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.n1;
import androidx.recyclerview.widget.r0;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.u0;
import androidx.recyclerview.widget.u1;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.yalantis.ucrop.view.CropImageView;
import ep.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayoutManager extends m1 implements FlexContainer, a2 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Rect f8278a0 = new Rect();
    public u1 K;
    public c2 L;
    public LayoutState M;
    public final AnchorInfo N;
    public u0 O;
    public u0 P;
    public SavedState Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final SparseArray V;
    public final Context W;
    public View X;
    public int Y;
    public final FlexboxHelper.FlexLinesResult Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8281c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8284f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8282d = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f8285t = new ArrayList();
    public final FlexboxHelper H = new FlexboxHelper(this);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnchorInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8289d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f8290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8291f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f8292g;

        public AnchorInfo() {
        }

        public static void a(AnchorInfo anchorInfo) {
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.i() || !flexboxLayoutManager.f8283e) {
                anchorInfo.f8288c = anchorInfo.f8290e ? flexboxLayoutManager.O.g() : flexboxLayoutManager.O.k();
            } else {
                anchorInfo.f8288c = anchorInfo.f8290e ? flexboxLayoutManager.O.g() : flexboxLayoutManager.getWidth() - flexboxLayoutManager.O.k();
            }
        }

        public static void b(AnchorInfo anchorInfo) {
            anchorInfo.f8286a = -1;
            anchorInfo.f8287b = -1;
            anchorInfo.f8288c = Integer.MIN_VALUE;
            anchorInfo.f8291f = false;
            anchorInfo.f8292g = false;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.i()) {
                int i11 = flexboxLayoutManager.f8280b;
                if (i11 == 0) {
                    anchorInfo.f8290e = flexboxLayoutManager.f8279a == 1;
                    return;
                } else {
                    anchorInfo.f8290e = i11 == 2;
                    return;
                }
            }
            int i12 = flexboxLayoutManager.f8280b;
            if (i12 == 0) {
                anchorInfo.f8290e = flexboxLayoutManager.f8279a == 3;
            } else {
                anchorInfo.f8290e = i12 == 2;
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(MzwEyWCkjXL.EBevPYN);
            sb2.append(this.f8286a);
            sb2.append(", mFlexLinePosition=");
            sb2.append(this.f8287b);
            sb2.append(", mCoordinate=");
            sb2.append(this.f8288c);
            sb2.append(", mPerpendicularCoordinate=");
            sb2.append(this.f8289d);
            sb2.append(", mLayoutFromEnd=");
            sb2.append(this.f8290e);
            sb2.append(", mValid=");
            sb2.append(this.f8291f);
            sb2.append(", mAssignedFromSavedState=");
            return a.l(sb2, this.f8292g, '}');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LayoutParams extends n1 implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.LayoutParams.1
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.f8294e = CropImageView.DEFAULT_ASPECT_RATIO;
                layoutParams.f8295f = 1.0f;
                layoutParams.f8296t = -1;
                layoutParams.H = -1.0f;
                layoutParams.M = 16777215;
                layoutParams.N = 16777215;
                layoutParams.f8294e = parcel.readFloat();
                layoutParams.f8295f = parcel.readFloat();
                layoutParams.f8296t = parcel.readInt();
                layoutParams.H = parcel.readFloat();
                layoutParams.K = parcel.readInt();
                layoutParams.L = parcel.readInt();
                layoutParams.M = parcel.readInt();
                layoutParams.N = parcel.readInt();
                layoutParams.O = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
                return layoutParams;
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutParams[] newArray(int i11) {
                return new LayoutParams[i11];
            }
        };
        public float H;
        public int K;
        public int L;
        public int M;
        public int N;
        public boolean O;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f8295f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f8296t;

        @Override // com.google.android.flexbox.FlexItem
        public final int A1() {
            return this.M;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float F0() {
            return this.f8294e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float M0() {
            return this.H;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int N() {
            return this.f8296t;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float T() {
            return this.f8295f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int Y0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int Z() {
            return this.K;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int b1() {
            return this.L;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean f1() {
            return this.O;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void g0(int i11) {
            this.K = i11;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int i1() {
            return this.N;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j0() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int w0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeFloat(this.f8294e);
            parcel.writeFloat(this.f8295f);
            parcel.writeInt(this.f8296t);
            parcel.writeFloat(this.H);
            parcel.writeInt(this.K);
            parcel.writeInt(this.L);
            parcel.writeInt(this.M);
            parcel.writeInt(this.N);
            parcel.writeByte(this.O ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void z0(int i11) {
            this.L = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f8307a = parcel.readInt();
                savedState.f8308b = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8308b;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SavedState{mAnchorPosition=");
            sb2.append(this.f8307a);
            sb2.append(", mAnchorOffset=");
            return a.j(sb2, this.f8308b, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f8307a);
            parcel.writeInt(this.f8308b);
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        AnchorInfo anchorInfo = new AnchorInfo();
        this.N = anchorInfo;
        this.R = -1;
        this.S = Integer.MIN_VALUE;
        this.T = Integer.MIN_VALUE;
        this.U = Integer.MIN_VALUE;
        this.V = new SparseArray();
        this.Y = -1;
        this.Z = new FlexboxHelper.FlexLinesResult();
        RecyclerView$LayoutManager$Properties properties = m1.getProperties(context, attributeSet, i11, i12);
        int i13 = properties.orientation;
        if (i13 != 0) {
            if (i13 == 1) {
                if (properties.reverseLayout) {
                    E(3);
                } else {
                    E(2);
                }
            }
        } else if (properties.reverseLayout) {
            E(1);
        } else {
            E(0);
        }
        int i14 = this.f8280b;
        if (i14 != 1) {
            if (i14 == 0) {
                removeAllViews();
                this.f8285t.clear();
                AnchorInfo.b(anchorInfo);
                anchorInfo.f8289d = 0;
            }
            this.f8280b = 1;
            this.O = null;
            this.P = null;
            requestLayout();
        }
        if (this.f8281c != 4) {
            removeAllViews();
            this.f8285t.clear();
            AnchorInfo.b(anchorInfo);
            anchorInfo.f8289d = 0;
            this.f8281c = 4;
            requestLayout();
        }
        this.W = context;
    }

    public static boolean l(int i11, int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (i13 > 0 && i11 != i13) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i11;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i11;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01f7  */
    public final int A(int i11, u1 u1Var, c2 c2Var) {
        int i12;
        if (getChildCount() != 0 && i11 != 0) {
            q();
            this.M.f8306j = true;
            boolean z11 = !i() && this.f8283e;
            int i13 = (!z11 ? i11 > 0 : i11 < 0) ? -1 : 1;
            int iAbs = Math.abs(i11);
            this.M.f8305i = i13;
            boolean zI = i();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
            boolean z12 = !zI && this.f8283e;
            FlexboxHelper flexboxHelper = this.H;
            if (i13 == 1) {
                View childAt = getChildAt(getChildCount() - 1);
                if (childAt != null) {
                    this.M.f8301e = this.O.b(childAt);
                    int position = getPosition(childAt);
                    View viewV = v(childAt, (FlexLine) this.f8285t.get(flexboxHelper.f8257c[position]));
                    LayoutState layoutState = this.M;
                    layoutState.f8304h = 1;
                    int i14 = position + 1;
                    layoutState.f8300d = i14;
                    int[] iArr = flexboxHelper.f8257c;
                    if (iArr.length <= i14) {
                        layoutState.f8299c = -1;
                    } else {
                        layoutState.f8299c = iArr[i14];
                    }
                    if (z12) {
                        layoutState.f8301e = this.O.e(viewV);
                        this.M.f8302f = this.O.k() + (-this.O.e(viewV));
                        LayoutState layoutState2 = this.M;
                        layoutState2.f8302f = Math.max(layoutState2.f8302f, 0);
                    } else {
                        layoutState.f8301e = this.O.b(viewV);
                        this.M.f8302f = this.O.b(viewV) - this.O.g();
                    }
                    int i15 = this.M.f8299c;
                    if ((i15 == -1 || i15 > this.f8285t.size() - 1) && this.M.f8300d <= this.L.b()) {
                        LayoutState layoutState3 = this.M;
                        int i16 = iAbs - layoutState3.f8302f;
                        FlexboxHelper.FlexLinesResult flexLinesResult = this.Z;
                        flexLinesResult.f8260a = null;
                        flexLinesResult.f8261b = 0;
                        if (i16 > 0) {
                            if (zI) {
                                this.H.b(flexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i16, layoutState3.f8300d, -1, this.f8285t);
                            } else {
                                this.H.b(flexLinesResult, iMakeMeasureSpec2, iMakeMeasureSpec, i16, layoutState3.f8300d, -1, this.f8285t);
                                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                                iMakeMeasureSpec = iMakeMeasureSpec;
                            }
                            flexboxHelper.h(iMakeMeasureSpec, iMakeMeasureSpec2, this.M.f8300d);
                            flexboxHelper.u(this.M.f8300d);
                        }
                    }
                    LayoutState layoutState4 = this.M;
                    layoutState4.f8297a = iAbs - layoutState4.f8302f;
                }
            } else {
                View childAt2 = getChildAt(0);
                if (childAt2 != null) {
                    this.M.f8301e = this.O.e(childAt2);
                    int position2 = getPosition(childAt2);
                    View viewT = t(childAt2, (FlexLine) this.f8285t.get(flexboxHelper.f8257c[position2]));
                    LayoutState layoutState5 = this.M;
                    layoutState5.f8304h = 1;
                    int i17 = flexboxHelper.f8257c[position2];
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        this.M.f8300d = position2 - ((FlexLine) this.f8285t.get(i17 - 1)).f8245h;
                    } else {
                        layoutState5.f8300d = -1;
                    }
                    LayoutState layoutState6 = this.M;
                    layoutState6.f8299c = i17 > 0 ? i17 - 1 : 0;
                    if (z12) {
                        layoutState6.f8301e = this.O.b(viewT);
                        this.M.f8302f = this.O.b(viewT) - this.O.g();
                        LayoutState layoutState7 = this.M;
                        layoutState7.f8302f = Math.max(layoutState7.f8302f, 0);
                    } else {
                        layoutState6.f8301e = this.O.e(viewT);
                        this.M.f8302f = this.O.k() + (-this.O.e(viewT));
                    }
                    LayoutState layoutState8 = this.M;
                    layoutState8.f8297a = iAbs - layoutState8.f8302f;
                }
            }
            LayoutState layoutState9 = this.M;
            int iR = r(u1Var, c2Var, layoutState9) + layoutState9.f8302f;
            if (iR >= 0) {
                if (z11) {
                    if (iAbs > iR) {
                        i12 = (-i13) * iR;
                    } else {
                        i12 = i11;
                    }
                } else if (iAbs > iR) {
                    i12 = i13 * iR;
                } else {
                    i12 = i11;
                }
                this.O.p(-i12);
                this.M.f8303g = i12;
                return i12;
            }
        }
        return 0;
    }

    public final int B(int i11) {
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        q();
        boolean zI = i();
        View view = this.X;
        int width = zI ? view.getWidth() : view.getHeight();
        int width2 = zI ? getWidth() : getHeight();
        int layoutDirection = getLayoutDirection();
        AnchorInfo anchorInfo = this.N;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i11);
            if (i11 < 0) {
                return -Math.min((width2 + anchorInfo.f8289d) - width, iAbs);
            }
            int i12 = anchorInfo.f8289d;
            if (i12 + i11 > 0) {
                return -i12;
            }
        } else {
            if (i11 > 0) {
                return Math.min((width2 - anchorInfo.f8289d) - width, i11);
            }
            int i13 = anchorInfo.f8289d;
            if (i13 + i11 < 0) {
                return -i13;
            }
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0103 A[SYNTHETIC] */
    public final void C(u1 u1Var, LayoutState layoutState) {
        int childCount;
        int i11;
        int childCount2;
        int i12;
        View childAt;
        int i13;
        if (layoutState.f8306j) {
            int i14 = layoutState.f8305i;
            FlexboxHelper flexboxHelper = this.H;
            int i15 = -1;
            if (i14 == -1) {
                if (layoutState.f8302f < 0 || (childCount2 = getChildCount()) == 0 || (childAt = getChildAt((i12 = childCount2 - 1))) == null || (i13 = flexboxHelper.f8257c[getPosition(childAt)]) == -1) {
                    return;
                }
                FlexLine flexLine = (FlexLine) this.f8285t.get(i13);
                for (int i16 = i12; i16 >= 0; i16--) {
                    View childAt2 = getChildAt(i16);
                    if (childAt2 != null) {
                        int i17 = layoutState.f8302f;
                        if (!i() && this.f8283e) {
                            if (this.O.b(childAt2) > i17) {
                                break;
                            }
                            if (flexLine.f8251o != getPosition(childAt2)) {
                                continue;
                            } else if (i13 <= 0) {
                                childCount2 = i16;
                                break;
                            } else {
                                i13 += layoutState.f8305i;
                                flexLine = (FlexLine) this.f8285t.get(i13);
                                childCount2 = i16;
                            }
                        } else {
                            if (this.O.e(childAt2) < this.O.f() - i17) {
                                break;
                            }
                            if (flexLine.f8251o != getPosition(childAt2)) {
                                continue;
                            } else if (i13 <= 0) {
                                childCount2 = i16;
                                break;
                            } else {
                                i13 += layoutState.f8305i;
                                flexLine = (FlexLine) this.f8285t.get(i13);
                                childCount2 = i16;
                            }
                        }
                    }
                }
                while (i12 >= childCount2) {
                    removeAndRecycleViewAt(i12, u1Var);
                    i12--;
                }
                return;
            }
            if (layoutState.f8302f >= 0 && (childCount = getChildCount()) != 0) {
                View childAt3 = getChildAt(0);
                if (childAt3 == null || (i11 = flexboxHelper.f8257c[getPosition(childAt3)]) == -1) {
                    return;
                }
                FlexLine flexLine2 = (FlexLine) this.f8285t.get(i11);
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt4 = getChildAt(i18);
                    if (childAt4 != null) {
                        int i19 = layoutState.f8302f;
                        if (!i() && this.f8283e) {
                            if (this.O.f() - this.O.e(childAt4) > i19) {
                                break;
                            }
                            if (flexLine2.f8252p != getPosition(childAt4)) {
                                continue;
                            } else if (i11 >= this.f8285t.size() - 1) {
                                i15 = i18;
                                break;
                            } else {
                                i11 += layoutState.f8305i;
                                flexLine2 = (FlexLine) this.f8285t.get(i11);
                                i15 = i18;
                            }
                        } else {
                            if (this.O.b(childAt4) > i19) {
                                break;
                            }
                            if (flexLine2.f8252p != getPosition(childAt4)) {
                                continue;
                            } else if (i11 >= this.f8285t.size() - 1) {
                                i15 = i18;
                                break;
                            } else {
                                i11 += layoutState.f8305i;
                                flexLine2 = (FlexLine) this.f8285t.get(i11);
                                i15 = i18;
                            }
                        }
                    }
                }
                while (i15 >= 0) {
                    removeAndRecycleViewAt(i15, u1Var);
                    i15--;
                }
            }
        }
    }

    public final void D() {
        int heightMode = i() ? getHeightMode() : getWidthMode();
        this.M.f8298b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    public final void E(int i11) {
        if (this.f8279a != i11) {
            removeAllViews();
            this.f8279a = i11;
            this.O = null;
            this.P = null;
            this.f8285t.clear();
            AnchorInfo anchorInfo = this.N;
            AnchorInfo.b(anchorInfo);
            anchorInfo.f8289d = 0;
            requestLayout();
        }
    }

    public final boolean F(View view, int i11, int i12, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && l(view.getWidth(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).width) && l(view.getHeight(), i12, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public final void G(int i11) {
        View viewW = w(getChildCount() - 1, -1);
        if (i11 >= (viewW != null ? getPosition(viewW) : -1)) {
            return;
        }
        int childCount = getChildCount();
        FlexboxHelper flexboxHelper = this.H;
        flexboxHelper.j(childCount);
        flexboxHelper.k(childCount);
        flexboxHelper.i(childCount);
        if (i11 >= flexboxHelper.f8257c.length) {
            return;
        }
        this.Y = i11;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.R = getPosition(childAt);
        if (i() || !this.f8283e) {
            this.S = this.O.e(childAt) - this.O.k();
        } else {
            this.S = this.O.h() + this.O.b(childAt);
        }
    }

    public final void H(AnchorInfo anchorInfo, boolean z11, boolean z12) {
        int i11;
        if (z12) {
            D();
        } else {
            this.M.f8298b = false;
        }
        if (i() || !this.f8283e) {
            this.M.f8297a = this.O.g() - anchorInfo.f8288c;
        } else {
            this.M.f8297a = anchorInfo.f8288c - getPaddingRight();
        }
        LayoutState layoutState = this.M;
        layoutState.f8300d = anchorInfo.f8286a;
        layoutState.f8304h = 1;
        layoutState.f8305i = 1;
        layoutState.f8301e = anchorInfo.f8288c;
        layoutState.f8302f = Integer.MIN_VALUE;
        layoutState.f8299c = anchorInfo.f8287b;
        if (!z11 || this.f8285t.size() <= 1 || (i11 = anchorInfo.f8287b) < 0 || i11 >= this.f8285t.size() - 1) {
            return;
        }
        FlexLine flexLine = (FlexLine) this.f8285t.get(anchorInfo.f8287b);
        LayoutState layoutState2 = this.M;
        layoutState2.f8299c++;
        layoutState2.f8300d += flexLine.f8245h;
    }

    public final void I(AnchorInfo anchorInfo, boolean z11, boolean z12) {
        if (z12) {
            D();
        } else {
            this.M.f8298b = false;
        }
        if (i() || !this.f8283e) {
            this.M.f8297a = anchorInfo.f8288c - this.O.k();
        } else {
            this.M.f8297a = (this.X.getWidth() - anchorInfo.f8288c) - this.O.k();
        }
        LayoutState layoutState = this.M;
        layoutState.f8300d = anchorInfo.f8286a;
        layoutState.f8304h = 1;
        layoutState.f8305i = -1;
        layoutState.f8301e = anchorInfo.f8288c;
        layoutState.f8302f = Integer.MIN_VALUE;
        int i11 = anchorInfo.f8287b;
        layoutState.f8299c = i11;
        if (!z11 || i11 <= 0) {
            return;
        }
        int size = this.f8285t.size();
        int i12 = anchorInfo.f8287b;
        if (size > i12) {
            FlexLine flexLine = (FlexLine) this.f8285t.get(i12);
            LayoutState layoutState2 = this.M;
            layoutState2.f8299c--;
            layoutState2.f8300d -= flexLine.f8245h;
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final void a(View view, int i11, int i12, FlexLine flexLine) {
        calculateItemDecorationsForChild(view, f8278a0);
        if (i()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            flexLine.f8242e += rightDecorationWidth;
            flexLine.f8243f += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        flexLine.f8242e += bottomDecorationHeight;
        flexLine.f8243f += bottomDecorationHeight;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final View c(int i11) {
        return e(i11);
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean canScrollHorizontally() {
        if (this.f8280b == 0) {
            return i();
        }
        if (!i()) {
            return true;
        }
        int width = getWidth();
        View view = this.X;
        return width > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean canScrollVertically() {
        if (this.f8280b == 0) {
            return !i();
        }
        if (!i()) {
            int height = getHeight();
            View view = this.X;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean checkLayoutParams(n1 n1Var) {
        return n1Var instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeHorizontalScrollExtent(c2 c2Var) {
        return n(c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeHorizontalScrollOffset(c2 c2Var) {
        return o(c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeHorizontalScrollRange(c2 c2Var) {
        return p(c2Var);
    }

    @Override // androidx.recyclerview.widget.a2
    public final PointF computeScrollVectorForPosition(int i11) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i12 = i11 < getPosition(childAt) ? -1 : 1;
        return i() ? new PointF(CropImageView.DEFAULT_ASPECT_RATIO, i12) : new PointF(i12, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeVerticalScrollExtent(c2 c2Var) {
        return n(c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeVerticalScrollOffset(c2 c2Var) {
        return o(c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeVerticalScrollRange(c2 c2Var) {
        return p(c2Var);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int d(int i11, int i12, int i13) {
        return m1.getChildMeasureSpec(getWidth(), getWidthMode(), i12, i13, canScrollHorizontally());
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final View e(int i11) {
        View view = (View) this.V.get(i11);
        return view != null ? view : this.K.d(i11);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int f(View view, int i11, int i12) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (i()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int g(int i11, int i12, int i13) {
        return m1.getChildMeasureSpec(getHeight(), getHeightMode(), i12, i13, canScrollVertically());
    }

    @Override // androidx.recyclerview.widget.m1
    public final n1 generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f8294e = CropImageView.DEFAULT_ASPECT_RATIO;
        layoutParams.f8295f = 1.0f;
        layoutParams.f8296t = -1;
        layoutParams.H = -1.0f;
        layoutParams.M = 16777215;
        layoutParams.N = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.m1
    public final n1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f8294e = CropImageView.DEFAULT_ASPECT_RATIO;
        layoutParams.f8295f = 1.0f;
        layoutParams.f8296t = -1;
        layoutParams.H = -1.0f;
        layoutParams.M = 16777215;
        layoutParams.N = 16777215;
        return layoutParams;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int getAlignItems() {
        return this.f8281c;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int getFlexDirection() {
        return this.f8279a;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int getFlexItemCount() {
        return this.L.b();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final List getFlexLinesInternal() {
        return this.f8285t;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int getFlexWrap() {
        return this.f8280b;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int getLargestMainSize() {
        if (this.f8285t.size() == 0) {
            return 0;
        }
        int size = this.f8285t.size();
        int iMax = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            iMax = Math.max(iMax, ((FlexLine) this.f8285t.get(i11)).f8242e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int getMaxLine() {
        return this.f8282d;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int getSumOfCrossSize() {
        int size = this.f8285t.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((FlexLine) this.f8285t.get(i12)).f8244g;
        }
        return i11;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final void h(View view, int i11) {
        this.V.put(i11, view);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final boolean i() {
        int i11 = this.f8279a;
        return i11 == 0 || i11 == 1;
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int j(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (i()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    public final int n(c2 c2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iB = c2Var.b();
        q();
        View viewS = s(iB);
        View viewU = u(iB);
        if (c2Var.b() == 0 || viewS == null || viewU == null) {
            return 0;
        }
        return Math.min(this.O.l(), this.O.b(viewU) - this.O.e(viewS));
    }

    public final int o(c2 c2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iB = c2Var.b();
        View viewS = s(iB);
        View viewU = u(iB);
        if (c2Var.b() == 0 || viewS == null || viewU == null) {
            return 0;
        }
        int position = getPosition(viewS);
        int position2 = getPosition(viewU);
        int iAbs = Math.abs(this.O.b(viewU) - this.O.e(viewS));
        int[] iArr = this.H.f8257c;
        int i11 = iArr[position];
        if (i11 == 0 || i11 == -1) {
            return 0;
        }
        return Math.round((i11 * (iAbs / ((iArr[position2] - i11) + 1))) + (this.O.k() - this.O.e(viewS)));
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onAdapterChanged(b1 b1Var, b1 b1Var2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.X = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onDetachedFromWindow(RecyclerView recyclerView, u1 u1Var) {
        onDetachedFromWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        super.onItemsAdded(recyclerView, i11, i12);
        G(i11);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        super.onItemsMoved(recyclerView, i11, i12, i13);
        G(Math.min(i11, i12));
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        super.onItemsRemoved(recyclerView, i11, i12);
        G(i11);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        super.onItemsUpdated(recyclerView, i11, i12, obj);
        G(i11);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0179  */
    /* JADX WARN: Code duplicated, block: B:106:0x0190  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:135:0x0211  */
    /* JADX WARN: Code duplicated, block: B:139:0x0217  */
    /* JADX WARN: Code duplicated, block: B:142:0x0224  */
    /* JADX WARN: Code duplicated, block: B:143:0x0231  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x0118  */
    /* JADX WARN: Code duplicated, block: B:83:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x0133  */
    /* JADX WARN: Code duplicated, block: B:86:0x013f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0143  */
    /* JADX WARN: Code duplicated, block: B:89:0x0151  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX WARN: Code duplicated, block: B:97:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0171  */
    @Override // androidx.recyclerview.widget.m1
    public final void onLayoutChildren(u1 u1Var, c2 c2Var) {
        View viewS;
        FlexboxLayoutManager flexboxLayoutManager;
        u0 u0Var;
        int position;
        int i11;
        int size;
        int i12;
        int i13;
        View viewFindViewByPosition;
        View childAt;
        boolean z11;
        int iE;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        int i16;
        int i17;
        this.K = u1Var;
        this.L = c2Var;
        int iB = c2Var.b();
        if (iB == 0 && c2Var.f2430g) {
            return;
        }
        int layoutDirection = getLayoutDirection();
        int i18 = this.f8279a;
        int i19 = 0;
        if (i18 == 0) {
            this.f8283e = layoutDirection == 1;
            this.f8284f = this.f8280b == 2;
        } else if (i18 == 1) {
            this.f8283e = layoutDirection != 1;
            this.f8284f = this.f8280b == 2;
        } else if (i18 == 2) {
            boolean z14 = layoutDirection == 1;
            this.f8283e = z14;
            if (this.f8280b == 2) {
                this.f8283e = !z14;
            }
            this.f8284f = false;
        } else if (i18 != 3) {
            this.f8283e = false;
            this.f8284f = false;
        } else {
            boolean z15 = layoutDirection == 1;
            this.f8283e = z15;
            if (this.f8280b == 2) {
                this.f8283e = !z15;
            }
            this.f8284f = true;
        }
        q();
        if (this.M == null) {
            this.M = new LayoutState(i19);
        }
        FlexboxHelper flexboxHelper = this.H;
        flexboxHelper.j(iB);
        flexboxHelper.k(iB);
        flexboxHelper.i(iB);
        this.M.f8306j = false;
        SavedState savedState = this.Q;
        if (savedState != null && (i17 = savedState.f8307a) >= 0 && i17 < iB) {
            this.R = i17;
        }
        AnchorInfo anchorInfo = this.N;
        if (!anchorInfo.f8291f || this.R != -1 || savedState != null) {
            AnchorInfo.b(anchorInfo);
            SavedState savedState2 = this.Q;
            if (c2Var.f2430g || (i13 = this.R) == -1) {
                if (getChildCount() != 0) {
                    if (anchorInfo.f8290e) {
                        viewS = u(c2Var.b());
                    } else {
                        viewS = s(c2Var.b());
                    }
                    if (viewS != null) {
                        flexboxLayoutManager = FlexboxLayoutManager.this;
                        if (flexboxLayoutManager.f8280b == 0) {
                            u0Var = flexboxLayoutManager.P;
                        } else {
                            u0Var = flexboxLayoutManager.O;
                        }
                        if (flexboxLayoutManager.i() && flexboxLayoutManager.f8283e) {
                            if (anchorInfo.f8290e) {
                                anchorInfo.f8288c = u0Var.m() + u0Var.e(viewS);
                            } else {
                                anchorInfo.f8288c = u0Var.b(viewS);
                            }
                        } else if (anchorInfo.f8290e) {
                            anchorInfo.f8288c = u0Var.m() + u0Var.b(viewS);
                        } else {
                            anchorInfo.f8288c = u0Var.e(viewS);
                        }
                        position = flexboxLayoutManager.getPosition(viewS);
                        anchorInfo.f8286a = position;
                        anchorInfo.f8292g = false;
                        int[] iArr = flexboxLayoutManager.H.f8257c;
                        if (position == -1) {
                            position = 0;
                        }
                        i11 = iArr[position];
                        if (i11 == -1) {
                            i11 = 0;
                        }
                        anchorInfo.f8287b = i11;
                        size = flexboxLayoutManager.f8285t.size();
                        i12 = anchorInfo.f8287b;
                        if (size > i12) {
                            anchorInfo.f8286a = ((FlexLine) flexboxLayoutManager.f8285t.get(i12)).f8251o;
                        }
                    } else {
                        AnchorInfo.a(anchorInfo);
                        anchorInfo.f8286a = 0;
                        anchorInfo.f8287b = 0;
                    }
                } else {
                    AnchorInfo.a(anchorInfo);
                    anchorInfo.f8286a = 0;
                    anchorInfo.f8287b = 0;
                }
            } else if (i13 < 0 || i13 >= c2Var.b()) {
                this.R = -1;
                this.S = Integer.MIN_VALUE;
                if (getChildCount() != 0) {
                    if (anchorInfo.f8290e) {
                        viewS = u(c2Var.b());
                    } else {
                        viewS = s(c2Var.b());
                    }
                    if (viewS != null) {
                        flexboxLayoutManager = FlexboxLayoutManager.this;
                        if (flexboxLayoutManager.f8280b == 0) {
                            u0Var = flexboxLayoutManager.P;
                        } else {
                            u0Var = flexboxLayoutManager.O;
                        }
                        if (flexboxLayoutManager.i()) {
                            if (anchorInfo.f8290e) {
                                anchorInfo.f8288c = u0Var.m() + u0Var.b(viewS);
                            } else {
                                anchorInfo.f8288c = u0Var.e(viewS);
                            }
                        } else if (anchorInfo.f8290e) {
                            anchorInfo.f8288c = u0Var.m() + u0Var.b(viewS);
                        } else {
                            anchorInfo.f8288c = u0Var.e(viewS);
                        }
                        position = flexboxLayoutManager.getPosition(viewS);
                        anchorInfo.f8286a = position;
                        anchorInfo.f8292g = false;
                        int[] iArr2 = flexboxLayoutManager.H.f8257c;
                        if (position == -1) {
                            position = 0;
                        }
                        i11 = iArr2[position];
                        if (i11 == -1) {
                            i11 = 0;
                        }
                        anchorInfo.f8287b = i11;
                        size = flexboxLayoutManager.f8285t.size();
                        i12 = anchorInfo.f8287b;
                        if (size > i12) {
                            anchorInfo.f8286a = ((FlexLine) flexboxLayoutManager.f8285t.get(i12)).f8251o;
                        }
                    } else {
                        AnchorInfo.a(anchorInfo);
                        anchorInfo.f8286a = 0;
                        anchorInfo.f8287b = 0;
                    }
                } else {
                    AnchorInfo.a(anchorInfo);
                    anchorInfo.f8286a = 0;
                    anchorInfo.f8287b = 0;
                }
            } else {
                int i21 = this.R;
                anchorInfo.f8286a = i21;
                anchorInfo.f8287b = flexboxHelper.f8257c[i21];
                SavedState savedState3 = this.Q;
                if (savedState3 != null) {
                    int iB2 = c2Var.b();
                    int i22 = savedState3.f8307a;
                    if (i22 >= 0 && i22 < iB2) {
                        anchorInfo.f8288c = this.O.k() + savedState2.f8308b;
                        anchorInfo.f8292g = true;
                        anchorInfo.f8287b = -1;
                    } else if (this.S == Integer.MIN_VALUE) {
                        viewFindViewByPosition = findViewByPosition(this.R);
                        if (viewFindViewByPosition != null) {
                            if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                                if (this.R < getPosition(childAt)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                anchorInfo.f8290e = z11;
                            }
                            AnchorInfo.a(anchorInfo);
                        } else if (this.O.c(viewFindViewByPosition) > this.O.l()) {
                            AnchorInfo.a(anchorInfo);
                        } else if (this.O.e(viewFindViewByPosition) - this.O.k() < 0) {
                            anchorInfo.f8288c = this.O.k();
                            anchorInfo.f8290e = false;
                        } else if (this.O.g() - this.O.b(viewFindViewByPosition) < 0) {
                            anchorInfo.f8288c = this.O.g();
                            anchorInfo.f8290e = true;
                        } else {
                            if (anchorInfo.f8290e) {
                                iE = this.O.m() + this.O.b(viewFindViewByPosition);
                            } else {
                                iE = this.O.e(viewFindViewByPosition);
                            }
                            anchorInfo.f8288c = iE;
                        }
                    } else if (i() && this.f8283e) {
                        anchorInfo.f8288c = this.S - this.O.h();
                    } else {
                        anchorInfo.f8288c = this.O.k() + this.S;
                    }
                } else if (this.S == Integer.MIN_VALUE) {
                    viewFindViewByPosition = findViewByPosition(this.R);
                    if (viewFindViewByPosition != null) {
                        if (getChildCount() > 0) {
                            if (this.R < getPosition(childAt)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            anchorInfo.f8290e = z11;
                        }
                        AnchorInfo.a(anchorInfo);
                    } else if (this.O.c(viewFindViewByPosition) > this.O.l()) {
                        AnchorInfo.a(anchorInfo);
                    } else if (this.O.e(viewFindViewByPosition) - this.O.k() < 0) {
                        anchorInfo.f8288c = this.O.k();
                        anchorInfo.f8290e = false;
                    } else if (this.O.g() - this.O.b(viewFindViewByPosition) < 0) {
                        anchorInfo.f8288c = this.O.g();
                        anchorInfo.f8290e = true;
                    } else {
                        if (anchorInfo.f8290e) {
                            iE = this.O.m() + this.O.b(viewFindViewByPosition);
                        } else {
                            iE = this.O.e(viewFindViewByPosition);
                        }
                        anchorInfo.f8288c = iE;
                    }
                } else if (i()) {
                    anchorInfo.f8288c = this.O.k() + this.S;
                } else {
                    anchorInfo.f8288c = this.O.k() + this.S;
                }
            }
            anchorInfo.f8291f = true;
        }
        detachAndScrapAttachedViews(u1Var);
        if (anchorInfo.f8290e) {
            I(anchorInfo, false, true);
        } else {
            H(anchorInfo, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean zI = i();
        Context context = this.W;
        if (zI) {
            int i23 = this.T;
            z12 = (i23 == Integer.MIN_VALUE || i23 == width) ? false : true;
            LayoutState layoutState = this.M;
            i14 = layoutState.f8298b ? context.getResources().getDisplayMetrics().heightPixels : layoutState.f8297a;
        } else {
            int i24 = this.U;
            z12 = (i24 == Integer.MIN_VALUE || i24 == height) ? false : true;
            LayoutState layoutState2 = this.M;
            i14 = layoutState2.f8298b ? context.getResources().getDisplayMetrics().widthPixels : layoutState2.f8297a;
        }
        int i25 = i14;
        this.T = width;
        this.U = height;
        int i26 = this.Y;
        FlexboxHelper.FlexLinesResult flexLinesResult = this.Z;
        if (i26 != -1 || (this.R == -1 && !z12)) {
            int iMin = i26 != -1 ? Math.min(i26, anchorInfo.f8286a) : anchorInfo.f8286a;
            flexLinesResult.f8260a = null;
            flexLinesResult.f8261b = 0;
            if (i()) {
                if (this.f8285t.size() > 0) {
                    flexboxHelper.d(iMin, this.f8285t);
                    this.H.b(this.Z, iMakeMeasureSpec, iMakeMeasureSpec2, i25, iMin, anchorInfo.f8286a, this.f8285t);
                } else {
                    flexboxHelper.i(iB);
                    this.H.b(this.Z, iMakeMeasureSpec, iMakeMeasureSpec2, i25, 0, -1, this.f8285t);
                }
            } else if (this.f8285t.size() > 0) {
                flexboxHelper.d(iMin, this.f8285t);
                int i27 = iMin;
                this.H.b(this.Z, iMakeMeasureSpec2, iMakeMeasureSpec, i25, i27, anchorInfo.f8286a, this.f8285t);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i27;
            } else {
                flexboxHelper.i(iB);
                this.H.b(this.Z, iMakeMeasureSpec2, iMakeMeasureSpec, i25, 0, -1, this.f8285t);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.f8285t = flexLinesResult.f8260a;
            flexboxHelper.h(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            flexboxHelper.u(iMin);
        } else if (!anchorInfo.f8290e) {
            this.f8285t.clear();
            flexLinesResult.f8260a = null;
            flexLinesResult.f8261b = 0;
            if (i()) {
                this.H.b(this.Z, iMakeMeasureSpec, iMakeMeasureSpec2, i25, 0, anchorInfo.f8286a, this.f8285t);
            } else {
                this.H.b(this.Z, iMakeMeasureSpec2, iMakeMeasureSpec, i25, 0, anchorInfo.f8286a, this.f8285t);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.f8285t = flexLinesResult.f8260a;
            flexboxHelper.h(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            flexboxHelper.u(0);
            int i28 = flexboxHelper.f8257c[anchorInfo.f8286a];
            anchorInfo.f8287b = i28;
            this.M.f8299c = i28;
        }
        r(u1Var, c2Var, this.M);
        if (anchorInfo.f8290e) {
            i16 = this.M.f8301e;
            z13 = true;
            H(anchorInfo, true, false);
            r(u1Var, c2Var, this.M);
            i15 = this.M.f8301e;
        } else {
            z13 = true;
            i15 = this.M.f8301e;
            I(anchorInfo, true, false);
            r(u1Var, c2Var, this.M);
            i16 = this.M.f8301e;
        }
        if (getChildCount() > 0) {
            if (anchorInfo.f8290e) {
                z(y(i15, u1Var, c2Var, z13) + i16, u1Var, c2Var, false);
            } else {
                y(z(i16, u1Var, c2Var, z13) + i15, u1Var, c2Var, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onLayoutCompleted(c2 c2Var) {
        this.Q = null;
        this.R = -1;
        this.S = Integer.MIN_VALUE;
        this.Y = -1;
        AnchorInfo.b(this.N);
        this.V.clear();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.Q = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final Parcelable onSaveInstanceState() {
        if (this.Q != null) {
            SavedState savedState = this.Q;
            SavedState savedState2 = new SavedState();
            savedState2.f8307a = savedState.f8307a;
            savedState2.f8308b = savedState.f8308b;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (getChildCount() <= 0) {
            savedState3.f8307a = -1;
            return savedState3;
        }
        View childAt = getChildAt(0);
        savedState3.f8307a = getPosition(childAt);
        savedState3.f8308b = this.O.e(childAt) - this.O.k();
        return savedState3;
    }

    public final int p(c2 c2Var) {
        if (getChildCount() != 0) {
            int iB = c2Var.b();
            View viewS = s(iB);
            View viewU = u(iB);
            if (c2Var.b() != 0 && viewS != null && viewU != null) {
                View viewW = w(0, getChildCount());
                int position = viewW == null ? -1 : getPosition(viewW);
                View viewW2 = w(getChildCount() - 1, -1);
                return (int) ((Math.abs(this.O.b(viewU) - this.O.e(viewS)) / (((viewW2 != null ? getPosition(viewW2) : -1) - position) + 1)) * c2Var.b());
            }
        }
        return 0;
    }

    public final void q() {
        if (this.O != null) {
            return;
        }
        if (i()) {
            if (this.f8280b == 0) {
                this.O = new t0(this, 0);
                this.P = new t0(this, 1);
                return;
            } else {
                this.O = new t0(this, 1);
                this.P = new t0(this, 0);
                return;
            }
        }
        if (this.f8280b == 0) {
            this.O = new t0(this, 1);
            this.P = new t0(this, 0);
        } else {
            this.O = new t0(this, 0);
            this.P = new t0(this, 1);
        }
    }

    public final int r(u1 u1Var, c2 c2Var, LayoutState layoutState) {
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean z12;
        Rect rect;
        int i14;
        int i15;
        int i16;
        float topDecorationHeight;
        Rect rect2;
        int i17 = layoutState.f8302f;
        if (i17 != Integer.MIN_VALUE) {
            int i18 = layoutState.f8297a;
            if (i18 < 0) {
                layoutState.f8302f = i17 + i18;
            }
            C(u1Var, layoutState);
        }
        int i19 = layoutState.f8297a;
        boolean zI = i();
        int i21 = i19;
        int i22 = 0;
        while (true) {
            if (i21 <= 0 && !this.M.f8298b) {
                break;
            }
            List list = this.f8285t;
            int i23 = layoutState.f8300d;
            if (i23 < 0 || i23 >= c2Var.b() || (i11 = layoutState.f8299c) < 0 || i11 >= list.size()) {
                break;
            }
            FlexLine flexLine = (FlexLine) this.f8285t.get(layoutState.f8299c);
            layoutState.f8300d = flexLine.f8251o;
            boolean zI2 = i();
            AnchorInfo anchorInfo = this.N;
            Rect rect3 = f8278a0;
            FlexboxHelper flexboxHelper = this.H;
            if (zI2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i24 = layoutState.f8301e;
                if (layoutState.f8305i == -1) {
                    i24 -= flexLine.f8244g;
                }
                int i25 = layoutState.f8300d;
                float f5 = anchorInfo.f8289d;
                float f11 = paddingLeft - f5;
                float leftDecorationWidth = (width - paddingRight) - f5;
                float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                int i26 = flexLine.f8245h;
                int i27 = i24;
                int i28 = i25;
                int i29 = 0;
                while (i28 < i25 + i26) {
                    int i30 = i25;
                    View viewE = e(i28);
                    if (viewE == null) {
                        i29 = i29;
                        i26 = i26;
                        i28 = i28;
                        rect2 = rect3;
                    } else {
                        if (layoutState.f8305i == 1) {
                            calculateItemDecorationsForChild(viewE, rect3);
                            addView(viewE);
                        } else {
                            calculateItemDecorationsForChild(viewE, rect3);
                            addView(viewE, i29);
                            i29++;
                        }
                        long j11 = flexboxHelper.f8258d[i28];
                        int i31 = (int) j11;
                        int i32 = (int) (j11 >> 32);
                        LayoutParams layoutParams = (LayoutParams) viewE.getLayoutParams();
                        if (F(viewE, i31, i32, layoutParams)) {
                            viewE.measure(i31, i32);
                        }
                        float leftDecorationWidth2 = f11 + getLeftDecorationWidth(viewE) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        float rightDecorationWidth = leftDecorationWidth - (getRightDecorationWidth(viewE) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int topDecorationHeight2 = getTopDecorationHeight(viewE) + i27;
                        if (this.f8283e) {
                            rect2 = rect3;
                            this.H.o(viewE, flexLine, Math.round(rightDecorationWidth) - viewE.getMeasuredWidth(), topDecorationHeight2, Math.round(rightDecorationWidth), viewE.getMeasuredHeight() + topDecorationHeight2);
                        } else {
                            rect2 = rect3;
                            this.H.o(viewE, flexLine, Math.round(leftDecorationWidth2), topDecorationHeight2, viewE.getMeasuredWidth() + Math.round(leftDecorationWidth2), viewE.getMeasuredHeight() + topDecorationHeight2);
                        }
                        float rightDecorationWidth2 = getRightDecorationWidth(viewE) + viewE.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + fMax + leftDecorationWidth2;
                        leftDecorationWidth = rightDecorationWidth - ((getLeftDecorationWidth(viewE) + (viewE.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin)) + fMax);
                        f11 = rightDecorationWidth2;
                    }
                    i28++;
                    i25 = i30;
                    flexboxHelper = flexboxHelper;
                    zI = zI;
                    i29 = i29;
                    i26 = i26;
                    rect3 = rect2;
                }
                z11 = zI;
                layoutState.f8299c += this.M.f8305i;
                i13 = flexLine.f8244g;
            } else {
                z11 = zI;
                Rect rect4 = rect3;
                boolean z13 = true;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i33 = layoutState.f8301e;
                if (layoutState.f8305i == -1) {
                    int i34 = flexLine.f8244g;
                    i12 = i33 + i34;
                    i33 -= i34;
                } else {
                    i12 = i33;
                }
                int i35 = layoutState.f8300d;
                float f12 = height - paddingBottom;
                float f13 = anchorInfo.f8289d;
                float f14 = paddingTop - f13;
                float f15 = f12 - f13;
                float fMax2 = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                int i36 = flexLine.f8245h;
                int i37 = i35;
                int i38 = 0;
                while (i37 < i35 + i36) {
                    int i39 = i35;
                    View viewE2 = e(i37);
                    if (viewE2 == null) {
                        i14 = i36;
                        i15 = i39;
                        topDecorationHeight = f15;
                        z12 = z13;
                        rect = rect4;
                        i16 = i37;
                    } else {
                        float f16 = f14;
                        long j12 = flexboxHelper.f8258d[i37];
                        float f17 = f15;
                        int i40 = (int) j12;
                        int i41 = (int) (j12 >> 32);
                        LayoutParams layoutParams2 = (LayoutParams) viewE2.getLayoutParams();
                        if (F(viewE2, i40, i41, layoutParams2)) {
                            viewE2.measure(i40, i41);
                        }
                        float topDecorationHeight3 = f16 + getTopDecorationHeight(viewE2) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        float bottomDecorationHeight = f17 - (getBottomDecorationHeight(viewE2) + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        z12 = true;
                        if (layoutState.f8305i == 1) {
                            rect = rect4;
                            calculateItemDecorationsForChild(viewE2, rect);
                            addView(viewE2);
                        } else {
                            rect = rect4;
                            calculateItemDecorationsForChild(viewE2, rect);
                            addView(viewE2, i38);
                            i38++;
                        }
                        int i42 = i38;
                        int leftDecorationWidth3 = getLeftDecorationWidth(viewE2) + i33;
                        int rightDecorationWidth3 = i12 - getRightDecorationWidth(viewE2);
                        int i43 = i37;
                        boolean z14 = this.f8283e;
                        if (!z14) {
                            i14 = i36;
                            i15 = i39;
                            i16 = i43;
                            if (this.f8284f) {
                                this.H.p(viewE2, flexLine, z14, leftDecorationWidth3, Math.round(bottomDecorationHeight) - viewE2.getMeasuredHeight(), viewE2.getMeasuredWidth() + leftDecorationWidth3, Math.round(bottomDecorationHeight));
                            } else {
                                this.H.p(viewE2, flexLine, z14, leftDecorationWidth3, Math.round(topDecorationHeight3), viewE2.getMeasuredWidth() + leftDecorationWidth3, viewE2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                            }
                        } else if (this.f8284f) {
                            i16 = i43;
                            i14 = i36;
                            i15 = i39;
                            this.H.p(viewE2, flexLine, z14, rightDecorationWidth3 - viewE2.getMeasuredWidth(), Math.round(bottomDecorationHeight) - viewE2.getMeasuredHeight(), rightDecorationWidth3, Math.round(bottomDecorationHeight));
                        } else {
                            i14 = i36;
                            i15 = i39;
                            i16 = i43;
                            this.H.p(viewE2, flexLine, z14, rightDecorationWidth3 - viewE2.getMeasuredWidth(), Math.round(topDecorationHeight3), rightDecorationWidth3, viewE2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                        }
                        float bottomDecorationHeight2 = getBottomDecorationHeight(viewE2) + viewE2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + fMax2 + topDecorationHeight3;
                        topDecorationHeight = bottomDecorationHeight - ((getTopDecorationHeight(viewE2) + (viewE2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin)) + fMax2);
                        f14 = bottomDecorationHeight2;
                        i38 = i42;
                    }
                    i37 = i16 + 1;
                    rect4 = rect;
                    z13 = z12;
                    f15 = topDecorationHeight;
                    i35 = i15;
                    i36 = i14;
                }
                layoutState.f8299c += this.M.f8305i;
                i13 = flexLine.f8244g;
            }
            i22 += i13;
            if (z11 || !this.f8283e) {
                layoutState.f8301e += flexLine.f8244g * layoutState.f8305i;
            } else {
                layoutState.f8301e -= flexLine.f8244g * layoutState.f8305i;
            }
            i21 -= flexLine.f8244g;
            i19 = i19;
            zI = z11;
        }
        int i44 = i19;
        int i45 = layoutState.f8297a - i22;
        layoutState.f8297a = i45;
        int i46 = layoutState.f8302f;
        if (i46 != Integer.MIN_VALUE) {
            int i47 = i46 + i22;
            layoutState.f8302f = i47;
            if (i45 < 0) {
                layoutState.f8302f = i47 + i45;
            }
            C(u1Var, layoutState);
        }
        return i44 - layoutState.f8297a;
    }

    public final View s(int i11) {
        View viewX = x(0, getChildCount(), i11);
        if (viewX == null) {
            return null;
        }
        int i12 = this.H.f8257c[getPosition(viewX)];
        if (i12 == -1) {
            return null;
        }
        return t(viewX, (FlexLine) this.f8285t.get(i12));
    }

    @Override // androidx.recyclerview.widget.m1
    public final int scrollHorizontallyBy(int i11, u1 u1Var, c2 c2Var) {
        if (!i() || this.f8280b == 0) {
            int iA = A(i11, u1Var, c2Var);
            this.V.clear();
            return iA;
        }
        int iB = B(i11);
        this.N.f8289d += iB;
        this.P.p(-iB);
        return iB;
    }

    @Override // androidx.recyclerview.widget.m1
    public final void scrollToPosition(int i11) {
        this.R = i11;
        this.S = Integer.MIN_VALUE;
        SavedState savedState = this.Q;
        if (savedState != null) {
            savedState.f8307a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.m1
    public final int scrollVerticallyBy(int i11, u1 u1Var, c2 c2Var) {
        if (i() || (this.f8280b == 0 && !i())) {
            int iA = A(i11, u1Var, c2Var);
            this.V.clear();
            return iA;
        }
        int iB = B(i11);
        this.N.f8289d += iB;
        this.P.p(-iB);
        return iB;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final void setFlexLines(List list) {
        this.f8285t = list;
    }

    @Override // androidx.recyclerview.widget.m1
    public final void smoothScrollToPosition(RecyclerView recyclerView, c2 c2Var, int i11) {
        r0 r0Var = new r0(recyclerView.getContext());
        r0Var.setTargetPosition(i11);
        startSmoothScroll(r0Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View t(View view, FlexLine flexLine) {
        boolean zI = i();
        int i11 = flexLine.f8245h;
        for (int i12 = 1; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f8283e || zI) {
                    if (this.O.e(view) > this.O.e(childAt)) {
                        view = childAt;
                    }
                } else if (this.O.b(view) < this.O.b(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View u(int i11) {
        View viewX = x(getChildCount() - 1, -1, i11);
        if (viewX == null) {
            return null;
        }
        return v(viewX, (FlexLine) this.f8285t.get(this.H.f8257c[getPosition(viewX)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View v(View view, FlexLine flexLine) {
        boolean zI = i();
        int childCount = (getChildCount() - flexLine.f8245h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f8283e || zI) {
                    if (this.O.b(view) < this.O.b(childAt)) {
                        view = childAt;
                    }
                } else if (this.O.e(view) > this.O.e(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View w(int i11, int i12) {
        int i13 = i12 > i11 ? 1 : -1;
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((ViewGroup.MarginLayoutParams) ((n1) childAt.getLayoutParams())).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((ViewGroup.MarginLayoutParams) ((n1) childAt.getLayoutParams())).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((ViewGroup.MarginLayoutParams) ((n1) childAt.getLayoutParams())).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((ViewGroup.MarginLayoutParams) ((n1) childAt.getLayoutParams())).bottomMargin;
            boolean z11 = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z12 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (z11 && z12) {
                return childAt;
            }
            i11 += i13;
        }
        return null;
    }

    public final View x(int i11, int i12, int i13) {
        int position;
        q();
        if (this.M == null) {
            this.M = new LayoutState(0);
        }
        int iK = this.O.k();
        int iG = this.O.g();
        int i14 = i12 > i11 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i13) {
                if (((n1) childAt.getLayoutParams()).f2546a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.O.e(childAt) >= iK && this.O.b(childAt) <= iG) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i11 += i14;
        }
        return view != null ? view : view2;
    }

    public final int y(int i11, u1 u1Var, c2 c2Var, boolean z11) {
        int iA;
        int iG;
        if (i() || !this.f8283e) {
            int iG2 = this.O.g() - i11;
            if (iG2 <= 0) {
                return 0;
            }
            iA = -A(-iG2, u1Var, c2Var);
        } else {
            int iK = i11 - this.O.k();
            if (iK <= 0) {
                return 0;
            }
            iA = A(iK, u1Var, c2Var);
        }
        int i12 = i11 + iA;
        if (!z11 || (iG = this.O.g() - i12) <= 0) {
            return iA;
        }
        this.O.p(iG);
        return iG + iA;
    }

    public final int z(int i11, u1 u1Var, c2 c2Var, boolean z11) {
        int iA;
        int iK;
        if (i() || !this.f8283e) {
            int iK2 = i11 - this.O.k();
            if (iK2 <= 0) {
                return 0;
            }
            iA = -A(iK2, u1Var, c2Var);
        } else {
            int iG = this.O.g() - i11;
            if (iG <= 0) {
                return 0;
            }
            iA = A(-iG, u1Var, c2Var);
        }
        int i12 = i11 + iA;
        if (!z11 || (iK = i12 - this.O.k()) <= 0) {
            return iA;
        }
        this.O.p(-iK);
        return iA - iK;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LayoutState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8304h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8305i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f8306j;

        private LayoutState() {
            this.f8304h = 1;
            this.f8305i = 1;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LayoutState{mAvailable=");
            sb2.append(this.f8297a);
            sb2.append(", mFlexLinePosition=");
            sb2.append(this.f8299c);
            sb2.append(", mPosition=");
            sb2.append(this.f8300d);
            sb2.append(", mOffset=");
            sb2.append(this.f8301e);
            sb2.append(", mScrollingOffset=");
            sb2.append(this.f8302f);
            sb2.append(", mLastScrollDelta=");
            sb2.append(this.f8303g);
            sb2.append(", mItemDirection=");
            sb2.append(this.f8304h);
            sb2.append(", mLayoutDirection=");
            return a.j(sb2, this.f8305i, '}');
        }

        public /* synthetic */ LayoutState(int i11) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsUpdated(RecyclerView recyclerView, int i11, int i12) {
        super.onItemsUpdated(recyclerView, i11, i12);
        G(i11);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final void b(FlexLine flexLine) {
    }
}
