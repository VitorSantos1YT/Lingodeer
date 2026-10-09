package com.lingo.lingoskill.ui.base;

import al.a;
import android.os.Bundle;
import bp.d4;
import bp.i4;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import fr.o0;
import ji.b;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class OffLineActivity extends b {
    public static final /* synthetic */ int R = 0;
    public long P;
    public String Q;

    public OffLineActivity() {
        super(BuildConfig.VERSION_NAME, d4.f4538a);
        this.Q = "m";
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    @Override // ji.b
    public final void r(Bundle bundle) {
        this.P = getIntent().getLongExtra(INTENTS.EXTRA_LONG, 0L);
        String stringExtra = getIntent().getStringExtra(INTENTS.EXTRA_STRING);
        if (stringExtra == null) {
            stringExtra = BuildConfig.VERSION_NAME;
        }
        this.Q = stringExtra;
        i4 i4Var = (i4) getSupportFragmentManager().C(R.id.fl_container);
        if (i4Var == null) {
            long j11 = this.P;
            String mfSource = this.Q;
            m.f(mfSource, "mfSource");
            i4 i4Var2 = new i4();
            Bundle bundle2 = new Bundle();
            bundle2.putLong(INTENTS.EXTRA_LONG, j11);
            bundle2.putString(INTENTS.EXTRA_STRING, mfSource);
            i4Var2.setArguments(bundle2);
            h.A(this, i4Var2);
            i4Var = i4Var2;
        }
        int i11 = ((o0) l()).f27733a.keyLanguage;
        if (i11 != 40) {
            if (i11 == 57) {
                new a(i4Var, this, 12);
                return;
            }
            if (i11 == 61) {
                new a(i4Var, this, 7);
                return;
            }
            if (i11 == 63) {
                new a(i4Var, this, 18);
                return;
            }
            if (i11 == 65) {
                new a(i4Var, this, 2);
                return;
            }
            if (i11 == 69) {
                new a(i4Var, this, 5);
                return;
            }
            switch (i11) {
                case 0:
                    new a(i4Var, this, 11);
                    break;
                case 1:
                    new a(i4Var, this, 3);
                    break;
                case 2:
                    new a(i4Var, this, 20);
                    break;
                case 3:
                    new ak.a(i4Var, this, 0);
                    break;
                case 4:
                    new a(i4Var, this, 4);
                    break;
                case 5:
                    new a(i4Var, this, 13);
                    break;
                case 6:
                    new a(i4Var, this, 9);
                    break;
                case 7:
                    new a(i4Var, this, 6);
                    break;
                case 8:
                    new ak.a(i4Var, this, 1);
                    break;
                default:
                    switch (i11) {
                        case 10:
                        case 22:
                            new a(i4Var, this, 1);
                            break;
                        case 11:
                            new a(i4Var, this, 11);
                            break;
                        case 12:
                            new a(i4Var, this, 3);
                            break;
                        case 13:
                            new a(i4Var, this, 20);
                            break;
                        case 14:
                            new a(i4Var, this, 4);
                            break;
                        case 15:
                            new a(i4Var, this, 13);
                            break;
                        case 16:
                            new a(i4Var, this, 9);
                            break;
                        case 17:
                            new ak.a(i4Var, this, 1);
                            break;
                        case 18:
                            new a(i4Var, this, 14);
                            break;
                        case 19:
                            new a(i4Var, this, 10);
                            break;
                        case 20:
                            break;
                        case 21:
                            new a(i4Var, this, 16);
                            break;
                        default:
                            switch (i11) {
                                case 47:
                                case 48:
                                    new a(i4Var, this, 8);
                                    break;
                                case 49:
                                case 50:
                                    new a(i4Var, this, 15);
                                    break;
                                case 51:
                                    break;
                                default:
                                    switch (i11) {
                                        case 53:
                                        case 54:
                                            new a(i4Var, this, 0);
                                            break;
                                        case 55:
                                            break;
                                        default:
                                            finish();
                                            break;
                                    }
                                    break;
                            }
                            new a(i4Var, this, 17);
                            break;
                    }
                    break;
            }
            return;
        }
        new a(i4Var, this, 19);
    }
}
