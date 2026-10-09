package com.google.android.material.behavior;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import l4.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f13939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f13940c;

    public /* synthetic */ a(b bVar, View view, int i11) {
        this.f13938a = i11;
        this.f13940c = bVar;
        this.f13939b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z11) {
        switch (this.f13938a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f13940c;
                if (z11 && hideBottomViewOnScrollBehavior.L == 1) {
                    hideBottomViewOnScrollBehavior.y(this.f13939b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f13940c;
                if (z11 && hideViewOnScrollBehavior.L == 1) {
                    hideViewOnScrollBehavior.z(this.f13939b);
                    break;
                }
                break;
        }
    }
}
