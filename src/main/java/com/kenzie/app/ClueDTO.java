package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClueDTO {
    @JsonProperty("canon")  //c
    public boolean canon;
    @JsonProperty("game")
    public Game game;  //c
    @JsonProperty("category")
    public Category category;  //c
    @JsonProperty("invalidCount")
    public int invalidcount;
    @JsonProperty("gameId")
    public int gameid;
    @JsonProperty("categoryId")
    public int categoryid;
    @JsonProperty("value")
    public int value;
    @JsonProperty("question")
    public String question;
    @JsonProperty("answer")
    public String answer;
    @JsonProperty("id")
    public int id;

    public boolean isCanon() {
        return canon;
    }

    public void setCanon(boolean canon) {
        this.canon = canon;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getInvalidcount() {
        return invalidcount;
    }

    public void setInvalidcount(int invalidcount) {
        this.invalidcount = invalidcount;
    }

    public int getGameid() {
        return gameid;
    }

    public void setGameid(int gameid) {
        this.gameid = gameid;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ClueDTO{" +
                "canon=" + canon +
                ", game=" + game +
                ", category=" + category +
                ", invalidcount=" + invalidcount +
                ", gameid=" + gameid +
                ", categoryid=" + categoryid +
                ", value=" + value +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", id=" + id +
                '}';
    }

    public static class Game {
        @JsonProperty("canon")
        public boolean canon;
        @JsonProperty("aired")
        public String aired;

        public boolean isCanon() {
            return canon;
        }

        public void setCanon(boolean canon) {
            this.canon = canon;
        }

        public String getAired() {
            return aired;
        }

        public void setAired(String aired) {
            this.aired = aired;
        }

        @Override
        public String toString() {
            return "Game{" +
                    "canon=" + canon +
                    ", aired='" + aired + '\'' +
                    '}';
        }

    }

    public static class Category {
        @JsonProperty("canon")
        public boolean canon;
        @JsonProperty("title")
        public String title;
        @JsonProperty("id")
        public int id;

        public boolean isCanon() {
            return canon;
        }

        public void setCanon(boolean canon) {
            this.canon = canon;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Category{" +
                    "canon=" + canon +
                    ", title='" + title + '\'' +
                    ", id=" + id +
                    '}';
        }
    }


}
