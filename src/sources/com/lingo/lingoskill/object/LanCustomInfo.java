package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LanCustomInfo {
    private Integer ackEnterPos;
    private Long ackUnitId;
    private String audio_lesson;
    private long currentEnteredUnitId;
    private String flashCardFocusUnit;
    private boolean flashCardIsLearnChar;
    private boolean flashCardIsLearnSent;
    private boolean flashCardIsLearnWord;
    private boolean isStartDownload;
    private long lan;
    private String lesson_exam;
    private String lesson_stars;
    private String main;
    private String main_tt;
    private int pronun;

    public LanCustomInfo(long j11, String str, String str2, String str3, String str4, String str5, int i11, boolean z11, long j12, String str6, boolean z12, boolean z13, boolean z14, Integer num, Long l9) {
        this.main = "1:1:1";
        this.pronun = 1;
        this.isStartDownload = false;
        this.currentEnteredUnitId = -1L;
        this.flashCardFocusUnit = "-1";
        this.flashCardIsLearnChar = true;
        this.flashCardIsLearnWord = true;
        this.flashCardIsLearnSent = true;
        this.ackEnterPos = 0;
        this.lan = j11;
        this.main = str;
        this.main_tt = str2;
        this.lesson_exam = str3;
        this.lesson_stars = str4;
        this.audio_lesson = str5;
        this.pronun = i11;
        this.isStartDownload = z11;
        this.currentEnteredUnitId = j12;
        this.flashCardFocusUnit = str6;
        this.flashCardIsLearnChar = z12;
        this.flashCardIsLearnWord = z13;
        this.flashCardIsLearnSent = z14;
        this.ackEnterPos = num;
        this.ackUnitId = l9;
    }

    public Integer getAckEnterPos() {
        Integer num = this.ackEnterPos;
        if (num == null) {
            return 0;
        }
        return num;
    }

    public Long getAckUnitId() {
        Long l9 = this.ackUnitId;
        if (l9 == null) {
            return -1L;
        }
        return l9;
    }

    public String getAudio_lesson() {
        return this.audio_lesson;
    }

    public long getCurrentEnteredUnitId() {
        return this.currentEnteredUnitId;
    }

    public String getFlashCardFocusUnit() {
        return this.flashCardFocusUnit;
    }

    public boolean getFlashCardIsLearnChar() {
        return this.flashCardIsLearnChar;
    }

    public boolean getFlashCardIsLearnSent() {
        return this.flashCardIsLearnSent;
    }

    public boolean getFlashCardIsLearnWord() {
        return this.flashCardIsLearnWord;
    }

    public boolean getIsStartDownload() {
        return this.isStartDownload;
    }

    public long getLan() {
        return this.lan;
    }

    public String getLesson_exam() {
        return this.lesson_exam;
    }

    public String getLesson_stars() {
        return this.lesson_stars;
    }

    public String getMain() {
        return this.main;
    }

    public String getMain_tt() {
        return this.main_tt;
    }

    public int getPronun() {
        return this.pronun;
    }

    public void setAckEnterPos(Integer num) {
        this.ackEnterPos = num;
    }

    public void setAckUnitId(Long l9) {
        this.ackUnitId = l9;
    }

    public void setAudio_lesson(String str) {
        this.audio_lesson = str;
    }

    public void setCurrentEnteredUnitId(long j11) {
        this.currentEnteredUnitId = j11;
    }

    public void setFlashCardFocusUnit(String str) {
        this.flashCardFocusUnit = str;
    }

    public void setFlashCardIsLearnChar(boolean z11) {
        this.flashCardIsLearnChar = z11;
    }

    public void setFlashCardIsLearnSent(boolean z11) {
        this.flashCardIsLearnSent = z11;
    }

    public void setFlashCardIsLearnWord(boolean z11) {
        this.flashCardIsLearnWord = z11;
    }

    public void setIsStartDownload(boolean z11) {
        this.isStartDownload = z11;
    }

    public void setLan(long j11) {
        this.lan = j11;
    }

    public void setLesson_exam(String str) {
        this.lesson_exam = str;
    }

    public void setLesson_stars(String str) {
        this.lesson_stars = str;
    }

    public void setMain(String str) {
        this.main = str;
    }

    public void setMain_tt(String str) {
        this.main_tt = str;
    }

    public void setPronun(int i11) {
        this.pronun = i11;
    }

    public LanCustomInfo() {
        this.main = "1:1:1";
        this.pronun = 1;
        this.isStartDownload = false;
        this.currentEnteredUnitId = -1L;
        this.flashCardFocusUnit = "-1";
        this.flashCardIsLearnChar = true;
        this.flashCardIsLearnWord = true;
        this.flashCardIsLearnSent = true;
        this.ackEnterPos = 0;
        this.ackUnitId = -1L;
    }
}
