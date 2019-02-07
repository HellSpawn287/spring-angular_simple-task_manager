export class Task {
    public id: number;
    public name: string;
    public completed: boolean;
    public dueData: string;

    constructor(id: number, name: string, comleted: boolean, dueData: string) {
        this.id = id;
        this.name = name;
        this.completed = comleted;
        this.dueData = dueData;
    }

}
