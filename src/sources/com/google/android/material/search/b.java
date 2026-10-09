package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchViewAnimationHelper f15162b;

    public /* synthetic */ b(SearchViewAnimationHelper searchViewAnimationHelper, int i11) {
        this.f15161a = i11;
        this.f15162b = searchViewAnimationHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15161a) {
            case 0:
                this.f15162b.m();
                break;
            case 1:
                SearchViewAnimationHelper searchViewAnimationHelper = this.f15162b;
                AnimatorSet animatorSetE = searchViewAnimationHelper.e(true);
                animatorSetE.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.1
                    public AnonymousClass1() {
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        SearchViewAnimationHelper searchViewAnimationHelper2 = SearchViewAnimationHelper.this;
                        if (!searchViewAnimationHelper2.f15137a.j()) {
                            searchViewAnimationHelper2.f15137a.l();
                        }
                        searchViewAnimationHelper2.f15137a.setTransitionState(SearchView.TransitionState.SHOWN);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        SearchViewAnimationHelper searchViewAnimationHelper2 = SearchViewAnimationHelper.this;
                        searchViewAnimationHelper2.f15139c.setVisibility(0);
                        SearchBar searchBar = searchViewAnimationHelper2.f15151p;
                        searchBar.H0.getClass();
                        View centerView = searchBar.getCenterView();
                        if (centerView instanceof AnimatableView) {
                            ((AnimatableView) centerView).a();
                        }
                        if (centerView != 0) {
                            centerView.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                        }
                    }
                });
                animatorSetE.start();
                break;
            default:
                SearchViewAnimationHelper searchViewAnimationHelper2 = this.f15162b;
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchViewAnimationHelper2.f15139c;
                clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
                AnimatorSet animatorSetH = searchViewAnimationHelper2.h(true);
                animatorSetH.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.3
                    public AnonymousClass3() {
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        SearchViewAnimationHelper searchViewAnimationHelper3 = SearchViewAnimationHelper.this;
                        if (!searchViewAnimationHelper3.f15137a.j()) {
                            searchViewAnimationHelper3.f15137a.l();
                        }
                        searchViewAnimationHelper3.f15137a.setTransitionState(SearchView.TransitionState.SHOWN);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        SearchViewAnimationHelper searchViewAnimationHelper3 = SearchViewAnimationHelper.this;
                        searchViewAnimationHelper3.f15139c.setVisibility(0);
                        searchViewAnimationHelper3.f15137a.setTransitionState(SearchView.TransitionState.SHOWING);
                    }
                });
                animatorSetH.start();
                break;
        }
    }
}
