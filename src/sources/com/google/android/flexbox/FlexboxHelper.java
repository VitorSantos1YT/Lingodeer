package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.yalantis.ucrop.view.CropImageView;
import ep.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class FlexboxHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlexContainer f8255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f8256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f8257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f8258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f8259e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FlexLinesResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f8260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8261b;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Order implements Comparable<Order> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8263b;

        private Order() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Order order) {
            Order order2 = order;
            int i11 = this.f8263b;
            int i12 = order2.f8263b;
            return i11 != i12 ? i11 - i12 : this.f8262a - order2.f8262a;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Order{order=");
            sb2.append(this.f8263b);
            sb2.append(", index=");
            return a.j(sb2, this.f8262a, '}');
        }

        public /* synthetic */ Order(int i11) {
            this();
        }
    }

    public FlexboxHelper(FlexContainer flexContainer) {
        this.f8255a = flexContainer;
    }

    public static ArrayList e(int i11, int i12, List list) {
        int i13 = (i11 - i12) / 2;
        ArrayList arrayList = new ArrayList();
        FlexLine flexLine = new FlexLine();
        flexLine.f8244g = i13;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (i14 == 0) {
                arrayList.add(flexLine);
            }
            arrayList.add((FlexLine) list.get(i14));
            if (i14 == list.size() - 1) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    public static int[] r(int i11, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i11];
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            Order order = (Order) obj;
            int i14 = order.f8262a;
            iArr[i12] = i14;
            sparseIntArray.append(i14, order.f8263b);
            i12++;
        }
        return iArr;
    }

    public final void a(List list, FlexLine flexLine, int i11, int i12) {
        flexLine.m = i12;
        this.f8255a.b(flexLine);
        flexLine.f8252p = i11;
        list.add(flexLine);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01ca  */
    public final void b(FlexLinesResult flexLinesResult, int i11, int i12, int i13, int i14, int i15, List list) {
        int iG;
        FlexItem flexItem;
        int i16;
        boolean z11;
        int i17 = i11;
        FlexContainer flexContainer = this.f8255a;
        boolean zI = flexContainer.i();
        int mode = View.MeasureSpec.getMode(i17);
        int size = View.MeasureSpec.getSize(i17);
        List arrayList = list == null ? new ArrayList() : list;
        flexLinesResult.f8260a = arrayList;
        boolean z12 = i15 == -1;
        int paddingStart = zI ? flexContainer.getPaddingStart() : flexContainer.getPaddingTop();
        int paddingEnd = zI ? flexContainer.getPaddingEnd() : flexContainer.getPaddingBottom();
        int paddingTop = zI ? flexContainer.getPaddingTop() : flexContainer.getPaddingStart();
        int paddingBottom = zI ? flexContainer.getPaddingBottom() : flexContainer.getPaddingEnd();
        FlexLine flexLine = new FlexLine();
        int i18 = i14;
        int i19 = 1;
        flexLine.f8251o = i18;
        int i21 = paddingStart + paddingEnd;
        flexLine.f8242e = i21;
        int flexItemCount = flexContainer.getFlexItemCount();
        boolean z13 = z12;
        int i22 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i23 = 0;
        int i24 = 0;
        while (i18 < flexItemCount) {
            int i25 = flexItemCount;
            View viewC = flexContainer.c(i18);
            if (viewC != null) {
                if (viewC.getVisibility() == 8) {
                    flexLine.f8246i++;
                    flexLine.f8245h++;
                    if (i18 == i25 - 1 && flexLine.a() != 0) {
                        a(arrayList, flexLine, i18, i23);
                    }
                } else {
                    if (viewC instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewC;
                        FlexItem flexItem2 = (FlexItem) compoundButton.getLayoutParams();
                        int iZ = flexItem2.Z();
                        int iB1 = flexItem2.b1();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                        int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                        if (iZ == -1) {
                            iZ = minimumWidth;
                        }
                        flexItem2.g0(iZ);
                        if (iB1 == -1) {
                            iB1 = minimumHeight;
                        }
                        flexItem2.z0(iB1);
                    }
                    FlexItem flexItem3 = (FlexItem) viewC.getLayoutParams();
                    if (flexItem3.N() == 4) {
                        flexLine.f8250n.add(Integer.valueOf(i18));
                    }
                    int iH = zI ? flexItem3.h() : flexItem3.f();
                    if (flexItem3.M0() != -1.0f && mode == 1073741824) {
                        iH = Math.round(size * flexItem3.M0());
                    }
                    if (zI) {
                        iG = flexContainer.d(i17, i21 + flexItem3.j0() + flexItem3.Y0(), iH);
                        int iG2 = flexContainer.g(i12, paddingTop + paddingBottom + flexItem3.w0() + flexItem3.h0() + i23, flexItem3.f());
                        viewC.measure(iG, iG2);
                        v(i18, iG, iG2, viewC);
                    } else {
                        int iD = flexContainer.d(i12, paddingTop + paddingBottom + flexItem3.j0() + flexItem3.Y0() + i23, flexItem3.h());
                        iG = flexContainer.g(i17, i21 + flexItem3.w0() + flexItem3.h0(), iH);
                        viewC.measure(iD, iG);
                        v(i18, iD, iG, viewC);
                    }
                    flexContainer.h(viewC, i18);
                    c(viewC, i18);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewC.getMeasuredState());
                    int i26 = flexLine.f8242e;
                    int measuredWidth = (zI ? viewC.getMeasuredWidth() : viewC.getMeasuredHeight()) + (zI ? flexItem3.j0() : flexItem3.w0()) + (zI ? flexItem3.Y0() : flexItem3.h0());
                    int size2 = arrayList.size();
                    if (flexContainer.getFlexWrap() != 0) {
                        if (flexItem3.f1()) {
                            flexItem = flexItem3;
                        } else {
                            if (mode == 0) {
                                flexItem = flexItem3;
                            } else {
                                flexItem = flexItem3;
                                int maxLine = flexContainer.getMaxLine();
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    int iF = flexContainer.f(viewC, i18, i24);
                                    if (iF > 0) {
                                        measuredWidth += iF;
                                    }
                                    if (size < i26 + measuredWidth) {
                                    }
                                }
                            }
                            i21 = i21;
                            arrayList = arrayList;
                            flexLine.f8245h += i19;
                            i24++;
                            i16 = i22;
                        }
                        if (flexLine.a() > 0) {
                            arrayList = arrayList;
                            a(arrayList, flexLine, i18 > 0 ? i18 - 1 : 0, i23);
                            i23 += flexLine.f8244g;
                        }
                        if (zI) {
                            arrayList = arrayList;
                            if (flexItem.f() == -1) {
                                viewC.measure(iG, flexContainer.g(i12, flexContainer.getPaddingTop() + flexContainer.getPaddingBottom() + flexItem.w0() + flexItem.h0() + i23, flexItem.f()));
                                c(viewC, i18);
                            }
                        } else {
                            arrayList = arrayList;
                            if (flexItem.h() == -1) {
                                viewC.measure(flexContainer.d(i12, flexContainer.getPaddingLeft() + flexContainer.getPaddingRight() + flexItem.j0() + flexItem.Y0() + i23, flexItem.h()), iG);
                                c(viewC, i18);
                            }
                        }
                        flexLine = new FlexLine();
                        flexLine.f8245h = i19;
                        i21 = i21;
                        flexLine.f8242e = i21;
                        flexLine.f8251o = i18;
                        i16 = Integer.MIN_VALUE;
                        i24 = 0;
                    } else {
                        flexItem = flexItem3;
                        i21 = i21;
                        arrayList = arrayList;
                        flexLine.f8245h += i19;
                        i24++;
                        i16 = i22;
                    }
                    flexLine.f8253q |= flexItem.F0() != CropImageView.DEFAULT_ASPECT_RATIO;
                    flexLine.f8254r |= flexItem.T() != CropImageView.DEFAULT_ASPECT_RATIO;
                    int[] iArr = this.f8257c;
                    if (iArr != null) {
                        iArr[i18] = arrayList.size();
                    }
                    flexLine.f8242e = (zI ? viewC.getMeasuredWidth() : viewC.getMeasuredHeight()) + (zI ? flexItem.j0() : flexItem.w0()) + (zI ? flexItem.Y0() : flexItem.h0()) + flexLine.f8242e;
                    flexLine.f8247j += flexItem.F0();
                    flexLine.f8248k += flexItem.T();
                    flexContainer.a(viewC, i18, i24, flexLine);
                    int iMax = Math.max(i16, (zI ? viewC.getMeasuredHeight() : viewC.getMeasuredWidth()) + (zI ? flexItem.w0() : flexItem.j0()) + (zI ? flexItem.h0() : flexItem.Y0()) + flexContainer.j(viewC));
                    flexLine.f8244g = Math.max(flexLine.f8244g, iMax);
                    if (zI) {
                        if (flexContainer.getFlexWrap() != 2) {
                            flexLine.f8249l = Math.max(flexLine.f8249l, viewC.getBaseline() + flexItem.w0());
                        } else {
                            flexLine.f8249l = Math.max(flexLine.f8249l, (viewC.getMeasuredHeight() - viewC.getBaseline()) + flexItem.h0());
                        }
                    }
                    if (i18 == i25 - 1 && flexLine.a() != 0) {
                        a(arrayList, flexLine, i18, i23);
                        i23 += flexLine.f8244g;
                    }
                    if (i15 != -1 && arrayList.size() > 0) {
                        if (((FlexLine) p.g(1, arrayList)).f8252p >= i15 && i18 >= i15 && !z13) {
                            i23 = -flexLine.f8244g;
                            z11 = true;
                        }
                        if (i23 <= i13 && z11) {
                            break;
                        } else {
                            i22 = iMax;
                        }
                    }
                    z11 = z13;
                    if (i23 <= i13) {
                    }
                    i22 = iMax;
                }
                i18++;
                z13 = z11;
                flexItemCount = i25;
                i19 = 1;
                i17 = i11;
            } else if (i18 == i25 - 1 && flexLine.a() != 0) {
                a(arrayList, flexLine, i18, i23);
            }
            z11 = z13;
            i18++;
            z13 = z11;
            flexItemCount = i25;
            i19 = 1;
            i17 = i11;
        }
        flexLinesResult.f8261b = iCombineMeasuredStates;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public final void c(View view, int i11) {
        boolean z11;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z12 = true;
        if (measuredWidth >= flexItem.Z()) {
            if (measuredWidth > flexItem.A1()) {
                measuredWidth = flexItem.A1();
            } else {
                z11 = false;
            }
            if (measuredHeight < flexItem.b1()) {
                measuredHeight = flexItem.b1();
            } else if (measuredHeight > flexItem.i1()) {
                measuredHeight = flexItem.i1();
            } else {
                z12 = z11;
            }
            if (z12) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                v(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.f8255a.h(view, i11);
            }
        }
        measuredWidth = flexItem.Z();
        z11 = true;
        if (measuredHeight < flexItem.b1()) {
            measuredHeight = flexItem.b1();
        } else if (measuredHeight > flexItem.i1()) {
            measuredHeight = flexItem.i1();
        } else {
            z12 = z11;
        }
        if (z12) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            v(i11, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.f8255a.h(view, i11);
        }
    }

    public final void d(int i11, List list) {
        int i12 = this.f8257c[i11];
        if (i12 == -1) {
            i12 = 0;
        }
        if (list.size() > i12) {
            list.subList(i12, list.size()).clear();
        }
        int[] iArr = this.f8257c;
        int length = iArr.length - 1;
        if (i11 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i11, length, -1);
        }
        long[] jArr = this.f8258d;
        int length2 = jArr.length - 1;
        if (i11 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i11, length2, 0L);
        }
    }

    public final ArrayList f(int i11) {
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            FlexItem flexItem = (FlexItem) this.f8255a.e(i13).getLayoutParams();
            Order order = new Order(i12);
            order.f8263b = flexItem.getOrder();
            order.f8262a = i13;
            arrayList.add(order);
        }
        return arrayList;
    }

    public final void g(int i11, int i12, int i13) {
        int mode;
        int size;
        FlexContainer flexContainer = this.f8255a;
        int flexDirection = flexContainer.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            mode = View.MeasureSpec.getMode(i12);
            size = View.MeasureSpec.getSize(i12);
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(p.j(flexDirection, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
        }
        List<FlexLine> flexLinesInternal = flexContainer.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = flexContainer.getSumOfCrossSize() + i13;
            int i14 = 0;
            if (flexLinesInternal.size() == 1) {
                ((FlexLine) flexLinesInternal.get(0)).f8244g = size - i13;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = flexContainer.getAlignContent();
                if (alignContent == 1) {
                    FlexLine flexLine = new FlexLine();
                    flexLine.f8244g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, flexLine);
                    return;
                }
                if (alignContent == 2) {
                    flexContainer.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size2 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f5 = 0.0f;
                    while (i14 < size3) {
                        arrayList.add((FlexLine) flexLinesInternal.get(i14));
                        if (i14 != flexLinesInternal.size() - 1) {
                            FlexLine flexLine2 = new FlexLine();
                            if (i14 == flexLinesInternal.size() - 2) {
                                flexLine2.f8244g = Math.round(f5 + size2);
                                f5 = 0.0f;
                            } else {
                                flexLine2.f8244g = Math.round(size2);
                            }
                            int i15 = flexLine2.f8244g;
                            float f11 = (size2 - i15) + f5;
                            if (f11 > 1.0f) {
                                flexLine2.f8244g = i15 + 1;
                                f11 -= 1.0f;
                            } else if (f11 < -1.0f) {
                                flexLine2.f8244g = i15 - 1;
                                f11 += 1.0f;
                            }
                            f5 = f11;
                            arrayList.add(flexLine2);
                        }
                        i14++;
                    }
                    flexContainer.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        flexContainer.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                        return;
                    }
                    int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    FlexLine flexLine3 = new FlexLine();
                    flexLine3.f8244g = size4;
                    for (FlexLine flexLine4 : flexLinesInternal) {
                        arrayList2.add(flexLine3);
                        arrayList2.add(flexLine4);
                        arrayList2.add(flexLine3);
                    }
                    flexContainer.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f12 = 0.0f;
                    while (i14 < size6) {
                        FlexLine flexLine5 = (FlexLine) flexLinesInternal.get(i14);
                        float f13 = flexLine5.f8244g + size5;
                        if (i14 == flexLinesInternal.size() - 1) {
                            f13 += f12;
                            f12 = 0.0f;
                        }
                        int iRound = Math.round(f13);
                        float f14 = (f13 - iRound) + f12;
                        if (f14 > 1.0f) {
                            iRound++;
                            f14 -= 1.0f;
                        } else if (f14 < -1.0f) {
                            iRound--;
                            f14 += 1.0f;
                        }
                        f12 = f14;
                        flexLine5.f8244g = iRound;
                        i14++;
                    }
                }
            }
        }
    }

    public final void h(int i11, int i12, int i13) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        FlexContainer flexContainer = this.f8255a;
        int flexItemCount = flexContainer.getFlexItemCount();
        boolean[] zArr = this.f8256b;
        if (zArr == null) {
            this.f8256b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f8256b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i13 >= flexContainer.getFlexItemCount()) {
            return;
        }
        int flexDirection = flexContainer.getFlexDirection();
        int flexDirection2 = flexContainer.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            int largestMainSize = flexContainer.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = flexContainer.getPaddingLeft();
            paddingRight = flexContainer.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(p.j(flexDirection, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i12);
            size = View.MeasureSpec.getSize(i12);
            if (mode2 != 1073741824) {
                size = flexContainer.getLargestMainSize();
            }
            paddingLeft = flexContainer.getPaddingTop();
            paddingRight = flexContainer.getPaddingBottom();
        }
        int i16 = paddingLeft + paddingRight;
        int i17 = size;
        int[] iArr = this.f8257c;
        int i18 = iArr != null ? iArr[i13] : 0;
        List flexLinesInternal = flexContainer.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i18 < size2) {
            FlexLine flexLine = (FlexLine) flexLinesInternal.get(i18);
            int i19 = flexLine.f8242e;
            if (i19 >= i17 || !flexLine.f8253q) {
                i14 = i11;
                i15 = i12;
                if (i19 > i17 && flexLine.f8254r) {
                    q(i14, i15, flexLine, i17, i16, false);
                }
            } else {
                i14 = i11;
                i15 = i12;
                l(i14, i15, flexLine, i17, i16, false);
            }
            i18++;
            i11 = i14;
            i12 = i15;
        }
    }

    public final void i(int i11) {
        int[] iArr = this.f8257c;
        if (iArr == null) {
            this.f8257c = new int[Math.max(i11, 10)];
        } else if (iArr.length < i11) {
            this.f8257c = Arrays.copyOf(this.f8257c, Math.max(iArr.length * 2, i11));
        }
    }

    public final void j(int i11) {
        long[] jArr = this.f8258d;
        if (jArr == null) {
            this.f8258d = new long[Math.max(i11, 10)];
        } else if (jArr.length < i11) {
            this.f8258d = Arrays.copyOf(this.f8258d, Math.max(jArr.length * 2, i11));
        }
    }

    public final void k(int i11) {
        long[] jArr = this.f8259e;
        if (jArr == null) {
            this.f8259e = new long[Math.max(i11, 10)];
        } else if (jArr.length < i11) {
            this.f8259e = Arrays.copyOf(this.f8259e, Math.max(jArr.length * 2, i11));
        }
    }

    public final void l(int i11, int i12, FlexLine flexLine, int i13, int i14, boolean z11) {
        int i15;
        float f5;
        float f11;
        boolean z12;
        int i16;
        int iMax;
        double d5;
        boolean z13;
        double d11;
        float f12 = flexLine.f8247j;
        float f13 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f12 <= CropImageView.DEFAULT_ASPECT_RATIO || i13 < (i15 = flexLine.f8242e)) {
            return;
        }
        float f14 = (i13 - i15) / f12;
        flexLine.f8242e = i14 + flexLine.f8243f;
        if (!z11) {
            flexLine.f8244g = Integer.MIN_VALUE;
        }
        int i17 = 0;
        boolean z14 = false;
        int i18 = 0;
        float f15 = 0.0f;
        while (i17 < flexLine.f8245h) {
            int i19 = flexLine.f8251o + i17;
            FlexContainer flexContainer = this.f8255a;
            View viewC = flexContainer.c(i19);
            if (viewC == null || viewC.getVisibility() == 8) {
                f5 = f13;
                i15 = i15;
                f11 = f14;
                z12 = z14;
                i16 = i17;
            } else {
                FlexItem flexItem = (FlexItem) viewC.getLayoutParams();
                int flexDirection = flexContainer.getFlexDirection();
                f5 = f13;
                if (flexDirection == 0 || flexDirection == 1) {
                    i15 = i15;
                    float f16 = f14;
                    z12 = z14;
                    int measuredWidth = viewC.getMeasuredWidth();
                    long[] jArr = this.f8259e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i19];
                    }
                    int measuredHeight = viewC.getMeasuredHeight();
                    long[] jArr2 = this.f8259e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i19] >> 32);
                    }
                    if (this.f8256b[i19] || flexItem.F0() <= f5) {
                        i16 = i17;
                        f11 = f16;
                    } else {
                        float fF0 = (f16 * flexItem.F0()) + measuredWidth;
                        if (i17 == flexLine.f8245h - 1) {
                            fF0 += f15;
                            f15 = f5;
                        }
                        int iRound = Math.round(fF0);
                        if (iRound > flexItem.A1()) {
                            iRound = flexItem.A1();
                            this.f8256b[i19] = true;
                            flexLine.f8247j -= flexItem.F0();
                            z12 = true;
                            i16 = i17;
                            f11 = f16;
                        } else {
                            float f17 = (fF0 - iRound) + f15;
                            i16 = i17;
                            f11 = f16;
                            double d12 = f17;
                            if (d12 > 1.0d) {
                                iRound++;
                                d5 = d12 - 1.0d;
                            } else if (d12 < -1.0d) {
                                iRound--;
                                d5 = d12 + 1.0d;
                            } else {
                                f15 = f17;
                            }
                            f15 = (float) d5;
                        }
                        int iM = m(i12, flexItem, flexLine.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewC.measure(iMakeMeasureSpec, iM);
                        int measuredWidth2 = viewC.getMeasuredWidth();
                        int measuredHeight2 = viewC.getMeasuredHeight();
                        v(i19, iMakeMeasureSpec, iM, viewC);
                        flexContainer.h(viewC, i19);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i18, measuredHeight + flexItem.w0() + flexItem.h0() + flexContainer.j(viewC));
                    flexLine.f8242e = measuredWidth + flexItem.j0() + flexItem.Y0() + flexLine.f8242e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewC.getMeasuredHeight();
                    long[] jArr3 = this.f8259e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i19] >> 32);
                    }
                    int measuredWidth3 = viewC.getMeasuredWidth();
                    long[] jArr4 = this.f8259e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i19];
                    }
                    if (this.f8256b[i19] || flexItem.F0() <= f5) {
                        i15 = i15;
                        z13 = z14;
                    } else {
                        float fF1 = (flexItem.F0() * f14) + measuredHeight3;
                        if (i17 == flexLine.f8245h - 1) {
                            fF1 += f15;
                            f15 = f5;
                        }
                        int iRound2 = Math.round(fF1);
                        if (iRound2 > flexItem.i1()) {
                            iRound2 = flexItem.i1();
                            this.f8256b[i19] = true;
                            flexLine.f8247j -= flexItem.F0();
                            z13 = true;
                        } else {
                            float f18 = (fF1 - iRound2) + f15;
                            double d13 = f18;
                            if (d13 > 1.0d) {
                                iRound2++;
                                d11 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    iRound2--;
                                    d11 = d13 + 1.0d;
                                } else {
                                    f15 = f18;
                                }
                                z13 = z14;
                            }
                            f15 = (float) d11;
                            z13 = z14;
                        }
                        int iN = n(i11, flexItem, flexLine.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewC.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth4 = viewC.getMeasuredWidth();
                        int measuredHeight4 = viewC.getMeasuredHeight();
                        v(i19, iN, iMakeMeasureSpec2, viewC);
                        flexContainer.h(viewC, i19);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i18, measuredWidth3 + flexItem.j0() + flexItem.Y0() + flexContainer.j(viewC));
                    flexLine.f8242e = measuredHeight3 + flexItem.w0() + flexItem.h0() + flexLine.f8242e;
                    f11 = f14;
                    z12 = z13;
                    i16 = i17;
                }
                flexLine.f8244g = Math.max(flexLine.f8244g, iMax);
                i18 = iMax;
            }
            i17 = i16 + 1;
            f14 = f11;
            f13 = f5;
            i15 = i15;
            z14 = z12;
        }
        int i21 = i15;
        if (!z14 || i21 == flexLine.f8242e) {
            return;
        }
        l(i11, i12, flexLine, i13, i14, true);
    }

    public final int m(int i11, FlexItem flexItem, int i12) {
        FlexContainer flexContainer = this.f8255a;
        int iG = flexContainer.g(i11, flexContainer.getPaddingTop() + flexContainer.getPaddingBottom() + flexItem.w0() + flexItem.h0() + i12, flexItem.f());
        int size = View.MeasureSpec.getSize(iG);
        if (size > flexItem.i1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.i1(), View.MeasureSpec.getMode(iG));
        }
        return size < flexItem.b1() ? View.MeasureSpec.makeMeasureSpec(flexItem.b1(), View.MeasureSpec.getMode(iG)) : iG;
    }

    public final int n(int i11, FlexItem flexItem, int i12) {
        FlexContainer flexContainer = this.f8255a;
        int iD = flexContainer.d(i11, flexContainer.getPaddingLeft() + flexContainer.getPaddingRight() + flexItem.j0() + flexItem.Y0() + i12, flexItem.h());
        int size = View.MeasureSpec.getSize(iD);
        if (size > flexItem.A1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.A1(), View.MeasureSpec.getMode(iD));
        }
        return size < flexItem.Z() ? View.MeasureSpec.makeMeasureSpec(flexItem.Z(), View.MeasureSpec.getMode(iD)) : iD;
    }

    public final void o(View view, FlexLine flexLine, int i11, int i12, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        FlexContainer flexContainer = this.f8255a;
        int alignItems = flexContainer.getAlignItems();
        if (flexItem.N() != -1) {
            alignItems = flexItem.N();
        }
        int i15 = flexLine.f8244g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (flexContainer.getFlexWrap() != 2) {
                    int i16 = i12 + i15;
                    view.layout(i11, (i16 - view.getMeasuredHeight()) - flexItem.h0(), i13, i16 - flexItem.h0());
                    return;
                } else {
                    view.layout(i11, view.getMeasuredHeight() + (i12 - i15) + flexItem.w0(), i13, view.getMeasuredHeight() + (i14 - i15) + flexItem.w0());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i15 - view.getMeasuredHeight()) + flexItem.w0()) - flexItem.h0()) / 2;
                if (flexContainer.getFlexWrap() != 2) {
                    int i17 = i12 + measuredHeight;
                    view.layout(i11, i17, i13, view.getMeasuredHeight() + i17);
                    return;
                } else {
                    int i18 = i12 - measuredHeight;
                    view.layout(i11, i18, i13, view.getMeasuredHeight() + i18);
                    return;
                }
            }
            if (alignItems == 3) {
                if (flexContainer.getFlexWrap() != 2) {
                    int iMax = Math.max(flexLine.f8249l - view.getBaseline(), flexItem.w0());
                    view.layout(i11, i12 + iMax, i13, i14 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (flexLine.f8249l - view.getMeasuredHeight()), flexItem.h0());
                    view.layout(i11, i12 - iMax2, i13, i14 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (flexContainer.getFlexWrap() != 2) {
            view.layout(i11, i12 + flexItem.w0(), i13, i14 + flexItem.w0());
        } else {
            view.layout(i11, i12 - flexItem.h0(), i13, i14 - flexItem.h0());
        }
    }

    public final void p(View view, FlexLine flexLine, boolean z11, int i11, int i12, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f8255a.getAlignItems();
        if (flexItem.N() != -1) {
            alignItems = flexItem.N();
        }
        int i15 = flexLine.f8244g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z11) {
                    view.layout(((i11 + i15) - view.getMeasuredWidth()) - flexItem.Y0(), i12, ((i13 + i15) - view.getMeasuredWidth()) - flexItem.Y0(), i14);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i11 - i15) + flexItem.j0(), i12, view.getMeasuredWidth() + (i13 - i15) + flexItem.j0(), i14);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i15 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z11) {
                    view.layout(i11 - marginStart, i12, i13 - marginStart, i14);
                    return;
                } else {
                    view.layout(i11 + marginStart, i12, i13 + marginStart, i14);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z11) {
            view.layout(i11 - flexItem.Y0(), i12, i13 - flexItem.Y0(), i14);
        } else {
            view.layout(i11 + flexItem.j0(), i12, i13 + flexItem.j0(), i14);
        }
    }

    public final void q(int i11, int i12, FlexLine flexLine, int i13, int i14, boolean z11) {
        float f5;
        int iMax;
        int iZ;
        int iB1;
        int i15 = flexLine.f8242e;
        float f11 = flexLine.f8248k;
        float f12 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f11 <= CropImageView.DEFAULT_ASPECT_RATIO || i13 > i15) {
            return;
        }
        float f13 = (i15 - i13) / f11;
        flexLine.f8242e = i14 + flexLine.f8243f;
        if (!z11) {
            flexLine.f8244g = Integer.MIN_VALUE;
        }
        int i16 = 0;
        boolean z12 = false;
        int i17 = 0;
        float f14 = 0.0f;
        while (i16 < flexLine.f8245h) {
            int i18 = flexLine.f8251o + i16;
            FlexContainer flexContainer = this.f8255a;
            View viewC = flexContainer.c(i18);
            if (viewC == null || viewC.getVisibility() == 8) {
                f5 = f12;
                f13 = f13;
            } else {
                FlexItem flexItem = (FlexItem) viewC.getLayoutParams();
                int flexDirection = flexContainer.getFlexDirection();
                f5 = f12;
                if (flexDirection == 0 || flexDirection == 1) {
                    f13 = f13;
                    int measuredWidth = viewC.getMeasuredWidth();
                    long[] jArr = this.f8259e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i18];
                    }
                    int measuredHeight = viewC.getMeasuredHeight();
                    long[] jArr2 = this.f8259e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i18] >> 32);
                    }
                    if (!this.f8256b[i18] && flexItem.T() > f5) {
                        float fT = measuredWidth - (f13 * flexItem.T());
                        if (i16 == flexLine.f8245h - 1) {
                            fT += f14;
                            f14 = f5;
                        }
                        int iRound = Math.round(fT);
                        if (iRound < flexItem.Z()) {
                            iZ = flexItem.Z();
                            this.f8256b[i18] = true;
                            flexLine.f8248k -= flexItem.T();
                            z12 = true;
                        } else {
                            float f15 = (fT - iRound) + f14;
                            double d5 = f15;
                            if (d5 > 1.0d) {
                                iZ = iRound + 1;
                                f15 -= 1.0f;
                            } else if (d5 < -1.0d) {
                                iZ = iRound - 1;
                                f15 += 1.0f;
                            } else {
                                iZ = iRound;
                            }
                            f14 = f15;
                        }
                        int iM = m(i12, flexItem, flexLine.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iZ, 1073741824);
                        viewC.measure(iMakeMeasureSpec, iM);
                        int measuredWidth2 = viewC.getMeasuredWidth();
                        int measuredHeight2 = viewC.getMeasuredHeight();
                        v(i18, iMakeMeasureSpec, iM, viewC);
                        flexContainer.h(viewC, i18);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i17, measuredHeight + flexItem.w0() + flexItem.h0() + flexContainer.j(viewC));
                    flexLine.f8242e = measuredWidth + flexItem.j0() + flexItem.Y0() + flexLine.f8242e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewC.getMeasuredHeight();
                    long[] jArr3 = this.f8259e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i18] >> 32);
                    }
                    int measuredWidth3 = viewC.getMeasuredWidth();
                    long[] jArr4 = this.f8259e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i18];
                    }
                    if (this.f8256b[i18] || flexItem.T() <= f5) {
                        f13 = f13;
                    } else {
                        float fT2 = measuredHeight3 - (flexItem.T() * f13);
                        if (i16 == flexLine.f8245h - 1) {
                            fT2 += f14;
                            f14 = f5;
                        }
                        int iRound2 = Math.round(fT2);
                        if (iRound2 < flexItem.b1()) {
                            iB1 = flexItem.b1();
                            this.f8256b[i18] = true;
                            flexLine.f8248k -= flexItem.T();
                            z12 = true;
                        } else {
                            float f16 = (fT2 - iRound2) + f14;
                            double d11 = f16;
                            if (d11 > 1.0d) {
                                iB1 = iRound2 + 1;
                                f16 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                iB1 = iRound2 - 1;
                                f16 += 1.0f;
                            } else {
                                iB1 = iRound2;
                            }
                            f14 = f16;
                        }
                        int iN = n(i11, flexItem, flexLine.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iB1, 1073741824);
                        viewC.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth4 = viewC.getMeasuredWidth();
                        int measuredHeight4 = viewC.getMeasuredHeight();
                        v(i18, iN, iMakeMeasureSpec2, viewC);
                        flexContainer.h(viewC, i18);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i17, measuredWidth3 + flexItem.j0() + flexItem.Y0() + flexContainer.j(viewC));
                    flexLine.f8242e = measuredHeight3 + flexItem.w0() + flexItem.h0() + flexLine.f8242e;
                }
                flexLine.f8244g = Math.max(flexLine.f8244g, iMax);
                i17 = iMax;
            }
            i16++;
            f12 = f5;
            f13 = f13;
        }
        if (!z12 || i15 == flexLine.f8242e) {
            return;
        }
        q(i11, i12, flexLine, i13, i14, true);
    }

    public final void s(View view, int i11, int i12) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iJ0 = (i11 - flexItem.j0()) - flexItem.Y0();
        FlexContainer flexContainer = this.f8255a;
        int iMin = Math.min(Math.max(iJ0 - flexContainer.j(view), flexItem.Z()), flexItem.A1());
        long[] jArr = this.f8259e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i12] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        v(i12, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        flexContainer.h(view, i12);
    }

    public final void t(View view, int i11, int i12) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iW0 = (i11 - flexItem.w0()) - flexItem.h0();
        FlexContainer flexContainer = this.f8255a;
        int iMin = Math.min(Math.max(iW0 - flexContainer.j(view), flexItem.b1()), flexItem.i1());
        long[] jArr = this.f8259e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i12] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        v(i12, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        flexContainer.h(view, i12);
    }

    public final void u(int i11) {
        View viewC;
        FlexContainer flexContainer = this.f8255a;
        if (i11 >= flexContainer.getFlexItemCount()) {
            return;
        }
        int flexDirection = flexContainer.getFlexDirection();
        if (flexContainer.getAlignItems() != 4) {
            for (FlexLine flexLine : flexContainer.getFlexLinesInternal()) {
                ArrayList arrayList = flexLine.f8250n;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    Integer num = (Integer) obj;
                    View viewC2 = flexContainer.c(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        t(viewC2, flexLine.f8244g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(p.j(flexDirection, "Invalid flex direction: "));
                        }
                        s(viewC2, flexLine.f8244g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f8257c;
        List flexLinesInternal = flexContainer.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i13 = iArr != null ? iArr[i11] : 0; i13 < size2; i13++) {
            FlexLine flexLine2 = (FlexLine) flexLinesInternal.get(i13);
            int i14 = flexLine2.f8245h;
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = flexLine2.f8251o + i15;
                if (i15 < flexContainer.getFlexItemCount() && (viewC = flexContainer.c(i16)) != null && viewC.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewC.getLayoutParams();
                    if (flexItem.N() == -1 || flexItem.N() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(viewC, flexLine2.f8244g, i16);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(p.j(flexDirection, "Invalid flex direction: "));
                            }
                            s(viewC, flexLine2.f8244g, i16);
                        }
                    }
                }
            }
        }
    }

    public final void v(int i11, int i12, int i13, View view) {
        long[] jArr = this.f8258d;
        if (jArr != null) {
            jArr[i11] = (((long) i12) & 4294967295L) | (((long) i13) << 32);
        }
        long[] jArr2 = this.f8259e;
        if (jArr2 != null) {
            jArr2[i11] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
