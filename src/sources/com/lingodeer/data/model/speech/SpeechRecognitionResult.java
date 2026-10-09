package com.lingodeer.data.model.speech;

import c00.a;
import c00.e;
import com.bumptech.glide.d;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.h;
import qy.j;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class SpeechRecognitionResult {
    private final int Channel;
    private final String DisplayText;
    private final long Duration;
    private final String Id;
    private final List<NBestResult> NBest;
    private final long Offset;
    private final String RecognitionStatus;
    private final double SNR;
    public static final Companion Companion = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, null, null, null, null, d.u(j.PUBLICATION, new m9(28))};

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return SpeechRecognitionResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ SpeechRecognitionResult(int i11, String str, String str2, long j11, long j12, int i12, String str3, double d5, List list, o1 o1Var) {
        if (255 != (i11 & 255)) {
            d1.k(i11, 255, SpeechRecognitionResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.Id = str;
        this.RecognitionStatus = str2;
        this.Offset = j11;
        this.Duration = j12;
        this.Channel = i12;
        this.DisplayText = str3;
        this.SNR = d5;
        this.NBest = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ a _childSerializers$_anonymous_() {
        return new g00.d(NBestResult$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpeechRecognitionResult copy$default(SpeechRecognitionResult speechRecognitionResult, String str, String str2, long j11, long j12, int i11, String str3, double d5, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = speechRecognitionResult.Id;
        }
        if ((i12 & 2) != 0) {
            str2 = speechRecognitionResult.RecognitionStatus;
        }
        if ((i12 & 4) != 0) {
            j11 = speechRecognitionResult.Offset;
        }
        if ((i12 & 8) != 0) {
            j12 = speechRecognitionResult.Duration;
        }
        if ((i12 & 16) != 0) {
            i11 = speechRecognitionResult.Channel;
        }
        if ((i12 & 32) != 0) {
            str3 = speechRecognitionResult.DisplayText;
        }
        if ((i12 & 64) != 0) {
            d5 = speechRecognitionResult.SNR;
        }
        if ((i12 & 128) != 0) {
            list = speechRecognitionResult.NBest;
        }
        List list2 = list;
        long j13 = j12;
        long j14 = j11;
        return speechRecognitionResult.copy(str, str2, j14, j13, i11, str3, d5, list2);
    }

    public static final /* synthetic */ void write$Self$data_release(SpeechRecognitionResult speechRecognitionResult, b bVar, g gVar) {
        h[] hVarArr = $childSerializers;
        bVar.w(gVar, 0, speechRecognitionResult.Id);
        bVar.w(gVar, 1, speechRecognitionResult.RecognitionStatus);
        bVar.v(gVar, 2, speechRecognitionResult.Offset);
        bVar.v(gVar, 3, speechRecognitionResult.Duration);
        bVar.g(4, speechRecognitionResult.Channel, gVar);
        bVar.w(gVar, 5, speechRecognitionResult.DisplayText);
        bVar.q(gVar, 6, speechRecognitionResult.SNR);
        bVar.A(gVar, 7, (a) hVarArr[7].getValue(), speechRecognitionResult.NBest);
    }

    public final String component1() {
        return this.Id;
    }

    public final String component2() {
        return this.RecognitionStatus;
    }

    public final long component3() {
        return this.Offset;
    }

    public final long component4() {
        return this.Duration;
    }

    public final int component5() {
        return this.Channel;
    }

    public final String component6() {
        return this.DisplayText;
    }

    public final double component7() {
        return this.SNR;
    }

    public final List<NBestResult> component8() {
        return this.NBest;
    }

    public final SpeechRecognitionResult copy(String Id, String RecognitionStatus, long j11, long j12, int i11, String DisplayText, double d5, List<NBestResult> NBest) {
        m.f(Id, "Id");
        m.f(RecognitionStatus, "RecognitionStatus");
        m.f(DisplayText, "DisplayText");
        m.f(NBest, "NBest");
        return new SpeechRecognitionResult(Id, RecognitionStatus, j11, j12, i11, DisplayText, d5, NBest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeechRecognitionResult)) {
            return false;
        }
        SpeechRecognitionResult speechRecognitionResult = (SpeechRecognitionResult) obj;
        return m.a(this.Id, speechRecognitionResult.Id) && m.a(this.RecognitionStatus, speechRecognitionResult.RecognitionStatus) && this.Offset == speechRecognitionResult.Offset && this.Duration == speechRecognitionResult.Duration && this.Channel == speechRecognitionResult.Channel && m.a(this.DisplayText, speechRecognitionResult.DisplayText) && Double.compare(this.SNR, speechRecognitionResult.SNR) == 0 && m.a(this.NBest, speechRecognitionResult.NBest);
    }

    public final int getChannel() {
        return this.Channel;
    }

    public final String getDisplayText() {
        return this.DisplayText;
    }

    public final long getDuration() {
        return this.Duration;
    }

    public final String getId() {
        return this.Id;
    }

    public final List<NBestResult> getNBest() {
        return this.NBest;
    }

    public final long getOffset() {
        return this.Offset;
    }

    public final String getRecognitionStatus() {
        return this.RecognitionStatus;
    }

    public final double getSNR() {
        return this.SNR;
    }

    public int hashCode() {
        return this.NBest.hashCode() + ((Double.hashCode(this.SNR) + defpackage.e.d(defpackage.e.b(this.Channel, defpackage.e.f(this.Duration, defpackage.e.f(this.Offset, defpackage.e.d(this.Id.hashCode() * 31, 31, this.RecognitionStatus), 31), 31), 31), 31, this.DisplayText)) * 31);
    }

    public String toString() {
        String str = this.Id;
        String str2 = this.RecognitionStatus;
        long j11 = this.Offset;
        long j12 = this.Duration;
        int i11 = this.Channel;
        String str3 = this.DisplayText;
        double d5 = this.SNR;
        List<NBestResult> list = this.NBest;
        StringBuilder sbS = defpackage.e.s("SpeechRecognitionResult(Id=", str, ", RecognitionStatus=", str2, ", Offset=");
        sbS.append(j11);
        ep.a.y(j12, ", Duration=", ", Channel=", sbS);
        sbS.append(i11);
        sbS.append(", DisplayText=");
        sbS.append(str3);
        sbS.append(", SNR=");
        sbS.append(d5);
        sbS.append(", NBest=");
        sbS.append(list);
        sbS.append(")");
        return sbS.toString();
    }

    public SpeechRecognitionResult(String Id, String RecognitionStatus, long j11, long j12, int i11, String DisplayText, double d5, List<NBestResult> NBest) {
        m.f(Id, "Id");
        m.f(RecognitionStatus, "RecognitionStatus");
        m.f(DisplayText, "DisplayText");
        m.f(NBest, "NBest");
        this.Id = Id;
        this.RecognitionStatus = RecognitionStatus;
        this.Offset = j11;
        this.Duration = j12;
        this.Channel = i11;
        this.DisplayText = DisplayText;
        this.SNR = d5;
        this.NBest = NBest;
    }
}
