package com.lingo.lingoskill.ui.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import bp.o4;
import com.lingo.lingoskill.ui.base.OffLineActivity;
import com.lingo.lingoskill.ui.base.OfflineManagerActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.Main;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import hj.g4;
import ji.b;
import kotlin.jvm.internal.m;
import l.a;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class OfflineManagerActivity extends b {
    public static final /* synthetic */ int P = 0;

    public OfflineManagerActivity() {
        super(BuildConfig.VERSION_NAME, o4.f4749a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        String string = getString(R.string.offline_resource_manager);
        m.e(string, "getString(...)");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        setSupportActionBar(toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        Main mainB = xt.b.e().b();
        if (mainB != null) {
            TextView textView = ((g4) j()).f32626c;
            if (mainB.getLesson_m() == 1) {
                textView.setEnabled(true);
                textView.setTextColor(getColor(R.color.primary_black));
                textView.setText(getString(R.string.audio_pack) + " (" + getString(R.string.male) + "-1)");
            } else {
                textView.setEnabled(false);
                textView.setTextColor(getColor(R.color.color_D6D6D6));
                textView.setText(getString(R.string.audio_pack) + " (" + getString(R.string.male) + "-1) coming soon");
            }
            final int i11 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: bp.n4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OfflineManagerActivity f4725b;

                {
                    this.f4725b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i12 = i11;
                    OfflineManagerActivity offlineManagerActivity = this.f4725b;
                    switch (i12) {
                        case 0:
                            int i13 = OfflineManagerActivity.P;
                            Intent intent = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent.putExtra(INTENTS.EXTRA_LONG, 2L);
                            intent.putExtra(INTENTS.EXTRA_STRING, "m");
                            offlineManagerActivity.startActivity(new Intent(intent));
                            break;
                        case 1:
                            int i14 = OfflineManagerActivity.P;
                            Intent intent2 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent2.putExtra(INTENTS.EXTRA_LONG, 2L);
                            intent2.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent2));
                            break;
                        case 2:
                            int i15 = OfflineManagerActivity.P;
                            Intent intent3 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent3.putExtra(INTENTS.EXTRA_LONG, 3L);
                            intent3.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent3));
                            break;
                        case 3:
                            int i16 = OfflineManagerActivity.P;
                            Intent intent4 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent4.putExtra(INTENTS.EXTRA_LONG, 4L);
                            intent4.putExtra(INTENTS.EXTRA_STRING, "m");
                            offlineManagerActivity.startActivity(new Intent(intent4));
                            break;
                        case 4:
                            int i17 = OfflineManagerActivity.P;
                            Intent intent5 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent5.putExtra(INTENTS.EXTRA_LONG, 4L);
                            intent5.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent5));
                            break;
                        default:
                            int i18 = OfflineManagerActivity.P;
                            Intent intent6 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent6.putExtra(INTENTS.EXTRA_LONG, 5L);
                            intent6.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent6));
                            break;
                    }
                }
            });
            TextView textView2 = ((g4) j()).f32625b;
            if (mainB.getLesson_f() == 1) {
                textView2.setEnabled(true);
                textView2.setTextColor(getColor(R.color.primary_black));
                textView2.setText(getString(R.string.audio_pack) + " (" + getString(R.string.female) + "-1)");
            } else {
                textView2.setEnabled(false);
                textView2.setTextColor(getColor(R.color.color_D6D6D6));
                textView2.setText(c.h(getString(R.string.audio_pack), " (", getString(R.string.female), DytezVyM.lGqVcfq, getString(R.string.coming_soon)));
            }
            final int i12 = 1;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: bp.n4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OfflineManagerActivity f4725b;

                {
                    this.f4725b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i13 = i12;
                    OfflineManagerActivity offlineManagerActivity = this.f4725b;
                    switch (i13) {
                        case 0:
                            int i14 = OfflineManagerActivity.P;
                            Intent intent = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent.putExtra(INTENTS.EXTRA_LONG, 2L);
                            intent.putExtra(INTENTS.EXTRA_STRING, "m");
                            offlineManagerActivity.startActivity(new Intent(intent));
                            break;
                        case 1:
                            int i15 = OfflineManagerActivity.P;
                            Intent intent2 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent2.putExtra(INTENTS.EXTRA_LONG, 2L);
                            intent2.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent2));
                            break;
                        case 2:
                            int i16 = OfflineManagerActivity.P;
                            Intent intent3 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent3.putExtra(INTENTS.EXTRA_LONG, 3L);
                            intent3.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent3));
                            break;
                        case 3:
                            int i17 = OfflineManagerActivity.P;
                            Intent intent4 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent4.putExtra(INTENTS.EXTRA_LONG, 4L);
                            intent4.putExtra(INTENTS.EXTRA_STRING, "m");
                            offlineManagerActivity.startActivity(new Intent(intent4));
                            break;
                        case 4:
                            int i18 = OfflineManagerActivity.P;
                            Intent intent5 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent5.putExtra(INTENTS.EXTRA_LONG, 4L);
                            intent5.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent5));
                            break;
                        default:
                            int i19 = OfflineManagerActivity.P;
                            Intent intent6 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent6.putExtra(INTENTS.EXTRA_LONG, 5L);
                            intent6.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent6));
                            break;
                    }
                }
            });
            final int i13 = 2;
            ((g4) j()).f32627d.setOnClickListener(new View.OnClickListener(this) { // from class: bp.n4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OfflineManagerActivity f4725b;

                {
                    this.f4725b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14 = i13;
                    OfflineManagerActivity offlineManagerActivity = this.f4725b;
                    switch (i14) {
                        case 0:
                            int i15 = OfflineManagerActivity.P;
                            Intent intent = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent.putExtra(INTENTS.EXTRA_LONG, 2L);
                            intent.putExtra(INTENTS.EXTRA_STRING, "m");
                            offlineManagerActivity.startActivity(new Intent(intent));
                            break;
                        case 1:
                            int i16 = OfflineManagerActivity.P;
                            Intent intent2 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent2.putExtra(INTENTS.EXTRA_LONG, 2L);
                            intent2.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent2));
                            break;
                        case 2:
                            int i17 = OfflineManagerActivity.P;
                            Intent intent3 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent3.putExtra(INTENTS.EXTRA_LONG, 3L);
                            intent3.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent3));
                            break;
                        case 3:
                            int i18 = OfflineManagerActivity.P;
                            Intent intent4 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent4.putExtra(INTENTS.EXTRA_LONG, 4L);
                            intent4.putExtra(INTENTS.EXTRA_STRING, "m");
                            offlineManagerActivity.startActivity(new Intent(intent4));
                            break;
                        case 4:
                            int i19 = OfflineManagerActivity.P;
                            Intent intent5 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent5.putExtra(INTENTS.EXTRA_LONG, 4L);
                            intent5.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent5));
                            break;
                        default:
                            int i110 = OfflineManagerActivity.P;
                            Intent intent6 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent6.putExtra(INTENTS.EXTRA_LONG, 5L);
                            intent6.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent6));
                            break;
                    }
                }
            });
            TextView textView3 = ((g4) j()).f32629f;
            if (mainB.getStory_m() == 1) {
                textView3.setEnabled(true);
                textView3.setTextColor(getColor(R.color.primary_black));
                textView3.setText(getString(R.string.audio_pack) + " (" + getString(R.string.male) + "-1)");
            } else {
                textView3.setEnabled(false);
                textView3.setTextColor(getColor(R.color.color_D6D6D6));
                textView3.setText(getString(R.string.audio_pack) + " (" + getString(R.string.male) + "-1) coming soon");
            }
            final int i14 = 3;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: bp.n4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OfflineManagerActivity f4725b;

                {
                    this.f4725b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = i14;
                    OfflineManagerActivity offlineManagerActivity = this.f4725b;
                    switch (i15) {
                        case 0:
                            int i16 = OfflineManagerActivity.P;
                            Intent intent = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent.putExtra(INTENTS.EXTRA_LONG, 2L);
                            intent.putExtra(INTENTS.EXTRA_STRING, "m");
                            offlineManagerActivity.startActivity(new Intent(intent));
                            break;
                        case 1:
                            int i17 = OfflineManagerActivity.P;
                            Intent intent2 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent2.putExtra(INTENTS.EXTRA_LONG, 2L);
                            intent2.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent2));
                            break;
                        case 2:
                            int i18 = OfflineManagerActivity.P;
                            Intent intent3 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent3.putExtra(INTENTS.EXTRA_LONG, 3L);
                            intent3.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent3));
                            break;
                        case 3:
                            int i19 = OfflineManagerActivity.P;
                            Intent intent4 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent4.putExtra(INTENTS.EXTRA_LONG, 4L);
                            intent4.putExtra(INTENTS.EXTRA_STRING, "m");
                            offlineManagerActivity.startActivity(new Intent(intent4));
                            break;
                        case 4:
                            int i110 = OfflineManagerActivity.P;
                            Intent intent5 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent5.putExtra(INTENTS.EXTRA_LONG, 4L);
                            intent5.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent5));
                            break;
                        default:
                            int i111 = OfflineManagerActivity.P;
                            Intent intent6 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent6.putExtra(INTENTS.EXTRA_LONG, 5L);
                            intent6.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent6));
                            break;
                    }
                }
            });
            TextView textView4 = ((g4) j()).f32628e;
            if (mainB.getStory_f() == 1) {
                textView4.setEnabled(true);
                textView4.setTextColor(getColor(R.color.primary_black));
                textView4.setText(getString(R.string.audio_pack) + " (" + getString(R.string.female) + "-1)");
            } else {
                textView4.setEnabled(false);
                textView4.setTextColor(getColor(R.color.color_D6D6D6));
                textView4.setText(getString(R.string.audio_pack) + " (" + getString(R.string.female) + "-1) coming soon");
            }
            final int i15 = 4;
            textView4.setOnClickListener(new View.OnClickListener(this) { // from class: bp.n4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OfflineManagerActivity f4725b;

                {
                    this.f4725b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = i15;
                    OfflineManagerActivity offlineManagerActivity = this.f4725b;
                    switch (i16) {
                        case 0:
                            int i17 = OfflineManagerActivity.P;
                            Intent intent = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent.putExtra(INTENTS.EXTRA_LONG, 2L);
                            intent.putExtra(INTENTS.EXTRA_STRING, "m");
                            offlineManagerActivity.startActivity(new Intent(intent));
                            break;
                        case 1:
                            int i18 = OfflineManagerActivity.P;
                            Intent intent2 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent2.putExtra(INTENTS.EXTRA_LONG, 2L);
                            intent2.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent2));
                            break;
                        case 2:
                            int i19 = OfflineManagerActivity.P;
                            Intent intent3 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent3.putExtra(INTENTS.EXTRA_LONG, 3L);
                            intent3.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent3));
                            break;
                        case 3:
                            int i110 = OfflineManagerActivity.P;
                            Intent intent4 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent4.putExtra(INTENTS.EXTRA_LONG, 4L);
                            intent4.putExtra(INTENTS.EXTRA_STRING, "m");
                            offlineManagerActivity.startActivity(new Intent(intent4));
                            break;
                        case 4:
                            int i111 = OfflineManagerActivity.P;
                            Intent intent5 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent5.putExtra(INTENTS.EXTRA_LONG, 4L);
                            intent5.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent5));
                            break;
                        default:
                            int i112 = OfflineManagerActivity.P;
                            Intent intent6 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent6.putExtra(INTENTS.EXTRA_LONG, 5L);
                            intent6.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent6));
                            break;
                    }
                }
            });
            TextView textView5 = ((g4) j()).f32630g;
            if (mainB.getStory_f() != 1 && mainB.getStory_m() != 1) {
                textView5.setEnabled(false);
                textView5.setTextColor(getColor(R.color.color_D6D6D6));
                textView5.setText(getString(R.string.image_pack) + " coming soon");
            }
            final int i16 = 5;
            textView5.setOnClickListener(new View.OnClickListener(this) { // from class: bp.n4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OfflineManagerActivity f4725b;

                {
                    this.f4725b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i17 = i16;
                    OfflineManagerActivity offlineManagerActivity = this.f4725b;
                    switch (i17) {
                        case 0:
                            int i18 = OfflineManagerActivity.P;
                            Intent intent = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent.putExtra(INTENTS.EXTRA_LONG, 2L);
                            intent.putExtra(INTENTS.EXTRA_STRING, "m");
                            offlineManagerActivity.startActivity(new Intent(intent));
                            break;
                        case 1:
                            int i19 = OfflineManagerActivity.P;
                            Intent intent2 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent2.putExtra(INTENTS.EXTRA_LONG, 2L);
                            intent2.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent2));
                            break;
                        case 2:
                            int i110 = OfflineManagerActivity.P;
                            Intent intent3 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent3.putExtra(INTENTS.EXTRA_LONG, 3L);
                            intent3.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent3));
                            break;
                        case 3:
                            int i111 = OfflineManagerActivity.P;
                            Intent intent4 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent4.putExtra(INTENTS.EXTRA_LONG, 4L);
                            intent4.putExtra(INTENTS.EXTRA_STRING, "m");
                            offlineManagerActivity.startActivity(new Intent(intent4));
                            break;
                        case 4:
                            int i112 = OfflineManagerActivity.P;
                            Intent intent5 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent5.putExtra(INTENTS.EXTRA_LONG, 4L);
                            intent5.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent5));
                            break;
                        default:
                            int i113 = OfflineManagerActivity.P;
                            Intent intent6 = new Intent(offlineManagerActivity, (Class<?>) OffLineActivity.class);
                            intent6.putExtra(INTENTS.EXTRA_LONG, 5L);
                            intent6.putExtra(INTENTS.EXTRA_STRING, "f");
                            offlineManagerActivity.startActivity(new Intent(intent6));
                            break;
                    }
                }
            });
        }
    }
}
