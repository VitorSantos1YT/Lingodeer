package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
interface FlexContainer {
    void a(View view, int i11, int i12, FlexLine flexLine);

    void b(FlexLine flexLine);

    View c(int i11);

    int d(int i11, int i12, int i13);

    View e(int i11);

    int f(View view, int i11, int i12);

    int g(int i11, int i12, int i13);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    void h(View view, int i11);

    boolean i();

    int j(View view);

    void setFlexLines(List list);
}
